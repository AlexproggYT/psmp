
package net.mcreator.pookie.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class RevexItem extends RecordItem {
	public RevexItem() {
		super(8, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("pookie:crossthemeremixmus")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4000);
	}
}
