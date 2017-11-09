package TheNexus;

import TheNexus.Init.ItemInit;
import TheNexus.Proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Information.MODID, name = Information.NAME, version = Information.VERSION, acceptedMinecraftVersions = Information.ACCEPTED_VERSIONS)
public class TheNexus {
	
	@Instance
	public static TheNexus instance;
	
	@SidedProxy(clientSide = Information.CLIENT, serverSide = Information.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	}
	
	@EventHandler
	public void positInit(FMLPostInitializationEvent event) {
		
	}
	
}
