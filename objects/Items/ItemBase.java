package TheNexus.objects.Items;

import TheNexus.TheNexus;
import TheNexus.Init.ItemInit;
import TheNexus.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

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
