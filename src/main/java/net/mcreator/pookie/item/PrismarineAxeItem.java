
package net.mcreator.pookie.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class PrismarineAxeItem extends AxeItem {
	public PrismarineAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2514;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 45f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 73;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.PRISMARINE_SHARD));
			}
		}, 1, -3f, new Item.Properties());
	}
}
