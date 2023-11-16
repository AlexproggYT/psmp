
package net.mcreator.pookie.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.pookie.init.PookieModItems;

public class OpalAxeItem extends AxeItem {
	public OpalAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2053;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 39f;
			}

			public int getLevel() {
				return 9;
			}

			public int getEnchantmentValue() {
				return 63;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PookieModItems.OPAL.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
