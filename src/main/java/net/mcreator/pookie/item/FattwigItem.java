
package net.mcreator.pookie.item;

import net.minecraftforge.common.crafting.CompoundIngredient;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.pookie.procedures.FattwigLivingEntityIsHitWithToolProcedure;

public class FattwigItem extends SwordItem {
	public FattwigItem() {
		super(new Tier() {
			public int getUses() {
				return 5;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return CompoundIngredient.of(Ingredient.of(new ItemStack(Items.STICK)), Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:logs"))), Ingredient.of(new ItemStack(Blocks.OAK_PLANKS)),
						Ingredient.of(new ItemStack(Blocks.SPRUCE_PLANKS)), Ingredient.of(new ItemStack(Blocks.BIRCH_PLANKS)), Ingredient.of(new ItemStack(Blocks.JUNGLE_PLANKS)), Ingredient.of(new ItemStack(Blocks.ACACIA_PLANKS)),
						Ingredient.of(new ItemStack(Blocks.DARK_OAK_PLANKS)), Ingredient.of(new ItemStack(Blocks.CRIMSON_PLANKS)), Ingredient.of(new ItemStack(Blocks.WARPED_PLANKS)), Ingredient.of(new ItemStack(Blocks.MANGROVE_PLANKS)));
			}
		}, 3, -3f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		FattwigLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
