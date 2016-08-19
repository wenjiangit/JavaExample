import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class Services {
	
	private static final Map<String,Provider> providers = new ConcurrentHashMap<String,Provider>();

	public static final String DEFAULT_NAME = "<def>";
	
	private Services(){}
	
	public static void registerDefaultProvider(Provider p){
		registerProvider(DEFAULT_NAME, p);
	}
	
	public static void registerProvider(String name,Provider p) {
		providers.put(name, p);
	}
	
	public static Service newInstance(){
		return newInstance(DEFAULT_NAME);
	}
	
	public static Service newInstance(String name) {
		Provider p = providers.get(name);
		if (p == null) {
			throw new IllegalArgumentException("no provider register with name:"+name);
		}
		return p.newService();
	}
	
	
	public interface Service{
		
	}
	
	public interface Provider{
		Service newService();
	}
}
