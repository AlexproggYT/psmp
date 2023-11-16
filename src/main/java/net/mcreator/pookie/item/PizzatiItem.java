
package net.mcreator.pookie.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class PizzatiItem extends RecordItem {
	public PizzatiItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("pookie:pizza")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4580);
	}
}
