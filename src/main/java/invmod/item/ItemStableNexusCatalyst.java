package invmod.item;

import invmod.Reference;
import invmod.mod_Invasion;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ItemStableNexusCatalyst extends Item
{

	private final String name = "stableNexusCatalyst";

	public ItemStableNexusCatalyst()
	{
		this.setRegistryName(this.name);
		GameRegistry.register(this);
		this.setUnlocalizedName(Reference.MODID + "_" + this.name);
		this.setMaxStackSize(1);
		this.setCreativeTab(mod_Invasion.tabInvmod);
	}

	public String getName()
	{
		return this.name;
	}
}
