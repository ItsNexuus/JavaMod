package TheNexus.objects.blocks;

import TheNexus.TheNexus;
import TheNexus.Init.ItemInit;
import TheNexus.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		TheNexus.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
