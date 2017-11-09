package TheNexus;

public class Information {
	public static final String MODID = "thenexus";
	public static final String NAME = "The Nexus";
	public static final String VERSION = "0.0.1";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	
	//Proxy
	public static final String CLIENT = "TheNexus.Proxies.ClientProxy";
	public static final String COMMON = "TheNexus.Proxies.CommonProxy";
	
	//Items
	public static enum TheNexusItems {
		ICEDIAMOND("icediamond", "itemicediamond");
		
		private String unlocalizedName;
		private String registryName;
		
		TheNexusItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
