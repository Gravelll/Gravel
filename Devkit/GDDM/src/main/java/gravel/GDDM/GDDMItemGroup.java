package gravel.GDDM;

import gravel.GDDM.lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GDDMItemGroup extends ItemGroup
{
	public GDDMItemGroup()
	{
		super("GDDM");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemList.flintsteel_plate);
	}

}
