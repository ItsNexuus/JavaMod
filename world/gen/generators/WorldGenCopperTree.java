package TheNexus.world.gen.generators;

import java.util.Random;

import TheNexus.Init.BlockInit;
import TheNexus.handlers.EnumHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class WorldGenCopperTree extends WorldGenAbstractTree {
	
	public static final IBlockState LOG = BlockInit.LOGS.getDefaultState().withProperty(BlockLogs.VARIANT, EnumHandler.EnumType.COPPER);
	public static final IBlockState LEAF = BlockInit.LEAVES.getDefaultState().withProperty(BlockLeaf.VARIANT, EnumHandler.EnumType.COPPER);
	
	private final int minHeight;
	
	public WorldGenCopperTree() {
		super(false);
		this.minHeight = 12;
	}
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		int height = this.minHeight + rand.nextInt(3);
		boolean flag = true;
		
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		
		for(int yPos = y; yPos <= y + 1 + height; yPos++) {
			int b0 = 2;
			if(yPos == y) b0 = 1;
			if(yPos >= y + 1 + height - 2) b0 = 2;
			
			BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos();
			
			for(int xPos = x - b0; xPos <= x + b0 && flag; xPos++) {
				for(int zPos = z - b0; zPos <- z + b0 && flag; zPos++) {
					if(yPos >= 0 && yPos < world.getHeight()) {
						if(!this.isReplaceable(world, new BlockPos(xPos, yPos, zPos))) {
							flag = false;
						}
					} else {
						flag = false;
					}
				}
			}
		}
		
		if(!flag) {
			return false;
		} else {
			BlockPos down = pos.down();
			IBlockState state = world.getBlockState(down);
			boolean isSoil = state.getBlock().canSustainPlant(state, world, down, EnumFacing.UP, (BlockSaplings)BlockInit.SAPLINGS);
			
			if(isSoil && y < world.getHeight() - height - 1) {
				state.getBlock().onPlantGrow(state, world, down, pos);
				
				for(int yPos = y - 3 + height; yPos <= y + height; yPos++) {
					
					int b1 = yPos - (y + height);
					int b2 = 1 - b1 / 2;
					
					for(int xPos = x - b2; xPos <= x + b2; xPos++) {
						
					}
					
				}
			}
		}
	}
}
