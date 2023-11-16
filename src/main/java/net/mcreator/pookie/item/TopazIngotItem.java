
package net.mcreator.pookie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TopazIngotItem extends Item {
	public TopazIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
