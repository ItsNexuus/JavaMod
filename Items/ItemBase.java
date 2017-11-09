package TheNexus.Items;

import TheNexus.Init.ItemInit;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		TheNexus.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
