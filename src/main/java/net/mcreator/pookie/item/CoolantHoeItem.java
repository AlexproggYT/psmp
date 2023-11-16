
package net.mcreator.pookie.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.pookie.init.PookieModItems;

public class CoolantHoeItem extends HoeItem {
	public CoolantHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1620;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 53;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PookieModItems.COOLANT_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
