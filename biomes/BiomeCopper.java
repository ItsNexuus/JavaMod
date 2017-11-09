package TheNexus.biomes;

import TheNexus.handlers.EnumHandler;
import net.minecraft.world.biome.Biome;

public class BiomeCopper extends Biome {
	
	protected static final WorldGenAbstract TREE = new WorldGenCopperTree();
	
	public BiomeCopper() {
		
		super(new BiomeProperties("Copper").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setRainDisabled().setWaterColor(16711680));
		
		topBlock = BlockInit.DIRT.getDefaultState().withProperty(BlockDirts.VARIANT, EnumHandler.EnumType.COPPER);
		
	}

}
