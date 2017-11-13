package com.xiu.weather;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xiu.util.HttpRequest;
import com.xiu.weather.City;
import com.xiu.weather.CityResponse;
import com.xiu.weather.CityResult;

import net.sf.json.JSONObject;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String url = "https://way.jd.com/jisuapi/weather1";
		String param = "appkey=577b8ccf94ad46442727245747e102ac";
		String responseString = HttpRequest.sendGet(url, param);
		/*System.out.println(responseString);
		StringBuilder result = new StringBuilder();*/
		try {
			/*@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader("src/cities.txt"));
	        String s = null;
	        while((s = br.readLine())!=null){
                result.append(s);
            }*/
	        
			@SuppressWarnings("rawtypes")
			Map resultMap = new HashMap();
			resultMap.put("result", City.class);
			
			
			JSONObject jsonObject = JSONObject.fromObject(responseString.toString());
			CityResponse cityResponse = (CityResponse) JSONObject.toBean(jsonObject, CityResponse.class, resultMap);
			CityResult cityResult = cityResponse.getResult();
			List<City> cityList = cityResult.getResult();
			
			
			for (City sheng : cityList) {
				if (sheng.getParentid().equals("0")) {
					System.out.println(sheng.getCity());
					String cityid = sheng.getCityid();
					for (City shi : cityList) {
						if (shi.getParentid().equals(cityid)) {
							System.out.print("--");
							System.out.print(shi.getCity());
							System.out.println();
							System.out.print("--");
							String shiid = shi.getCityid();
							for (City xian : cityList) {
								if (xian.getParentid().equals(shiid)) {
									System.out.print("--" + xian.getCity());
								}
							}
							System.out.println();
						}
					}	
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
