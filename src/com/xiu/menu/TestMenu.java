package com.xiu.menu;

import java.util.HashMap;
import java.util.Map;

import com.xiu.menu.Classify;
import com.xiu.menu.ClassifyList;
import com.xiu.menu.ClassifyResponse;
import com.xiu.util.HttpRequest;

import net.sf.json.JSONObject;

public class TestMenu {
	
	private static String baseUrl = "https://way.jd.com/jisuapi/";
	private static String url = "recipe_class";
	
	private static String param = "appkey=577b8ccf94ad46442727245747e102ac";


	/**
	 * 根据URL、parameter调用接口后映射至实体类
	 * @return ClassifyResponse
	 */
	public static ClassifyResponse getClassifyResponse() {
		//获取返回字符串，转换为JSON对象
		JSONObject jsonObject = JSONObject.fromObject(HttpRequest.sendGet(baseUrl + url, param));
		//创建Classify的Map
		Map<String, Class<?>> classifyMap = new HashMap<String, Class<?>>();
		classifyMap.put("list", Classify.class);
		//创建ClassifyList的Map
		Map<String, Class<?>> classifyListMap = new HashMap<String, Class<?>>(classifyMap);
		classifyListMap.put("result", ClassifyList.class);
		//将JSON映射到ClassifyResponse对象
		ClassifyResponse classifyResponse = (ClassifyResponse) JSONObject.toBean(jsonObject, ClassifyResponse.class, classifyListMap);
		return classifyResponse;
	}	
	
	public static void main(String[] args) {
		try {
			/*Class<?> classObject = Class.forName("Classify");
			Field[] fields = classObject.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field.getName());
			}*/
				
			for (ClassifyList classifyList : getClassifyResponse().getResult().getResult()) {
					System.out.println(classifyList.getClassid() + "--->" + classifyList.getName() + "  ");				;
					for (Classify classify : classifyList.getList()) {
						System.out.print(classify.getClassid() + "--" + classify.getName() + "|");
					}
					System.out.println();		
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
