
package net.mcreator.pookie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.pookie.init.PookieModFluids;

public class FloweringpoisonItem extends BucketItem {
	public FloweringpoisonItem() {
		super(PookieModFluids.FLOWERINGPOISON, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
