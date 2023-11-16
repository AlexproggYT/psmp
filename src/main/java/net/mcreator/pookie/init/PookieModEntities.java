
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.pookie.entity.WeurmEntity;
import net.mcreator.pookie.entity.StarEntity;
import net.mcreator.pookie.entity.PinkwomEntity;
import net.mcreator.pookie.entity.OnioncreeperEntity;
import net.mcreator.pookie.entity.GreenweurmEntity;
import net.mcreator.pookie.entity.FragmentEntity;
import net.mcreator.pookie.entity.EchoremnantEntityProjectile;
import net.mcreator.pookie.entity.EchoremnantEntity;
import net.mcreator.pookie.entity.DecimatorEntity;
import net.mcreator.pookie.entity.BlueweurmEntity;
import net.mcreator.pookie.entity.AlbinowomEntity;
import net.mcreator.pookie.entity.AlbinoratEntity;
import net.mcreator.pookie.PookieMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PookieModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PookieMod.MODID);
	public static final RegistryObject<EntityType<WeurmEntity>> WEURM = register("weurm",
			EntityType.Builder.<WeurmEntity>of(WeurmEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WeurmEntity::new)

					.sized(1.4f, 1.4f));
	public static final RegistryObject<EntityType<AlbinoratEntity>> ALBINORAT = register("albinorat",
			EntityType.Builder.<AlbinoratEntity>of(AlbinoratEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoratEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StarEntity>> STAR = register("projectile_star",
			EntityType.Builder.<StarEntity>of(StarEntity::new, MobCategory.MISC).setCustomClientFactory(StarEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<OnioncreeperEntity>> ONIONCREEPER = register("onioncreeper",
			EntityType.Builder.<OnioncreeperEntity>of(OnioncreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OnioncreeperEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<BlueweurmEntity>> BLUEWEURM = register("blueweurm",
			EntityType.Builder.<BlueweurmEntity>of(BlueweurmEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueweurmEntity::new)

					.sized(1.4f, 1.4f));
	public static final RegistryObject<EntityType<GreenweurmEntity>> GREENWEURM = register("greenweurm",
			EntityType.Builder.<GreenweurmEntity>of(GreenweurmEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreenweurmEntity::new)

					.sized(1.4f, 1.4f));
	public static final RegistryObject<EntityType<AlbinowomEntity>> ALBINOWOM = register("albinowom",
			EntityType.Builder.<AlbinowomEntity>of(AlbinowomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinowomEntity::new)

					.sized(1.4f, 1.4f));
	public static final RegistryObject<EntityType<PinkwomEntity>> PINKWOM = register("pinkwom",
			EntityType.Builder.<PinkwomEntity>of(PinkwomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PinkwomEntity::new).fireImmune().sized(1.4f, 1.4f));
	public static final RegistryObject<EntityType<EchoremnantEntity>> ECHOREMNANT = register("echoremnant",
			EntityType.Builder.<EchoremnantEntity>of(EchoremnantEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EchoremnantEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EchoremnantEntityProjectile>> ECHOREMNANT_PROJECTILE = register("projectile_echoremnant", EntityType.Builder.<EchoremnantEntityProjectile>of(EchoremnantEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(EchoremnantEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FragmentEntity>> FRAGMENT = register("fragment",
			EntityType.Builder.<FragmentEntity>of(FragmentEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FragmentEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DecimatorEntity>> DECIMATOR = register("decimator", EntityType.Builder.<DecimatorEntity>of(DecimatorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(512)
			.setUpdateInterval(3).setCustomClientFactory(DecimatorEntity::new).fireImmune().sized(0.6f, 0.6f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WeurmEntity.init();
			AlbinoratEntity.init();
			OnioncreeperEntity.init();
			BlueweurmEntity.init();
			GreenweurmEntity.init();
			AlbinowomEntity.init();
			PinkwomEntity.init();
			EchoremnantEntity.init();
			FragmentEntity.init();
			DecimatorEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WEURM.get(), WeurmEntity.createAttributes().build());
		event.put(ALBINORAT.get(), AlbinoratEntity.createAttributes().build());
		event.put(ONIONCREEPER.get(), OnioncreeperEntity.createAttributes().build());
		event.put(BLUEWEURM.get(), BlueweurmEntity.createAttributes().build());
		event.put(GREENWEURM.get(), GreenweurmEntity.createAttributes().build());
		event.put(ALBINOWOM.get(), AlbinowomEntity.createAttributes().build());
		event.put(PINKWOM.get(), PinkwomEntity.createAttributes().build());
		event.put(ECHOREMNANT.get(), EchoremnantEntity.createAttributes().build());
		event.put(FRAGMENT.get(), FragmentEntity.createAttributes().build());
		event.put(DECIMATOR.get(), DecimatorEntity.createAttributes().build());
	}
}
