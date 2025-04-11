package yarnwrap.world;
public class WorldEvents { public net.minecraft.world.WorldEvents wrapperContained; public WorldEvents(net.minecraft.world.WorldEvents wrapperContained) { this.wrapperContained = wrapperContained; }

public int ZOMBIE_INFECTS_VILLAGER() { return wrapperContained.ZOMBIE_INFECTS_VILLAGER; }
// public void ZOMBIE_INFECTS_VILLAGER(int value) { wrapperContained.ZOMBIE_INFECTS_VILLAGER = value; }
public int ZOMBIE_VILLAGER_CURED() { return wrapperContained.ZOMBIE_VILLAGER_CURED; }
// public void ZOMBIE_VILLAGER_CURED(int value) { wrapperContained.ZOMBIE_VILLAGER_CURED = value; }
public int ENDER_DRAGON_DIES() { return wrapperContained.ENDER_DRAGON_DIES; }
// public void ENDER_DRAGON_DIES(int value) { wrapperContained.ENDER_DRAGON_DIES = value; }
public int ANVIL_DESTROYED() { return wrapperContained.ANVIL_DESTROYED; }
// public void ANVIL_DESTROYED(int value) { wrapperContained.ANVIL_DESTROYED = value; }
public int ANVIL_USED() { return wrapperContained.ANVIL_USED; }
// public void ANVIL_USED(int value) { wrapperContained.ANVIL_USED = value; }
public int ANVIL_LANDS() { return wrapperContained.ANVIL_LANDS; }
// public void ANVIL_LANDS(int value) { wrapperContained.ANVIL_LANDS = value; }
public int TRAVEL_THROUGH_PORTAL() { return wrapperContained.TRAVEL_THROUGH_PORTAL; }
// public void TRAVEL_THROUGH_PORTAL(int value) { wrapperContained.TRAVEL_THROUGH_PORTAL = value; }
public int CHORUS_FLOWER_GROWS() { return wrapperContained.CHORUS_FLOWER_GROWS; }
// public void CHORUS_FLOWER_GROWS(int value) { wrapperContained.CHORUS_FLOWER_GROWS = value; }
public int CHORUS_FLOWER_DIES() { return wrapperContained.CHORUS_FLOWER_DIES; }
// public void CHORUS_FLOWER_DIES(int value) { wrapperContained.CHORUS_FLOWER_DIES = value; }
public int BREWING_STAND_BREWS() { return wrapperContained.BREWING_STAND_BREWS; }
// public void BREWING_STAND_BREWS(int value) { wrapperContained.BREWING_STAND_BREWS = value; }
public int END_PORTAL_OPENED() { return wrapperContained.END_PORTAL_OPENED; }
// public void END_PORTAL_OPENED(int value) { wrapperContained.END_PORTAL_OPENED = value; }
public int PHANTOM_BITES() { return wrapperContained.PHANTOM_BITES; }
// public void PHANTOM_BITES(int value) { wrapperContained.PHANTOM_BITES = value; }
public int ZOMBIE_CONVERTS_TO_DROWNED() { return wrapperContained.ZOMBIE_CONVERTS_TO_DROWNED; }
// public void ZOMBIE_CONVERTS_TO_DROWNED(int value) { wrapperContained.ZOMBIE_CONVERTS_TO_DROWNED = value; }
public int HUSK_CONVERTS_TO_ZOMBIE() { return wrapperContained.HUSK_CONVERTS_TO_ZOMBIE; }
// public void HUSK_CONVERTS_TO_ZOMBIE(int value) { wrapperContained.HUSK_CONVERTS_TO_ZOMBIE = value; }
public int GRINDSTONE_USED() { return wrapperContained.GRINDSTONE_USED; }
// public void GRINDSTONE_USED(int value) { wrapperContained.GRINDSTONE_USED = value; }
public int LECTERN_BOOK_PAGE_TURNED() { return wrapperContained.LECTERN_BOOK_PAGE_TURNED; }
// public void LECTERN_BOOK_PAGE_TURNED(int value) { wrapperContained.LECTERN_BOOK_PAGE_TURNED = value; }
public int SMITHING_TABLE_USED() { return wrapperContained.SMITHING_TABLE_USED; }
// public void SMITHING_TABLE_USED(int value) { wrapperContained.SMITHING_TABLE_USED = value; }
public int POINTED_DRIPSTONE_LANDS() { return wrapperContained.POINTED_DRIPSTONE_LANDS; }
// public void POINTED_DRIPSTONE_LANDS(int value) { wrapperContained.POINTED_DRIPSTONE_LANDS = value; }
public int POINTED_DRIPSTONE_DRIPS_LAVA_INTO_CAULDRON() { return wrapperContained.POINTED_DRIPSTONE_DRIPS_LAVA_INTO_CAULDRON; }
// public void POINTED_DRIPSTONE_DRIPS_LAVA_INTO_CAULDRON(int value) { wrapperContained.POINTED_DRIPSTONE_DRIPS_LAVA_INTO_CAULDRON = value; }
public int POINTED_DRIPSTONE_DRIPS_WATER_INTO_CAULDRON() { return wrapperContained.POINTED_DRIPSTONE_DRIPS_WATER_INTO_CAULDRON; }
// public void POINTED_DRIPSTONE_DRIPS_WATER_INTO_CAULDRON(int value) { wrapperContained.POINTED_DRIPSTONE_DRIPS_WATER_INTO_CAULDRON = value; }
public int SKELETON_CONVERTS_TO_STRAY() { return wrapperContained.SKELETON_CONVERTS_TO_STRAY; }
// public void SKELETON_CONVERTS_TO_STRAY(int value) { wrapperContained.SKELETON_CONVERTS_TO_STRAY = value; }
public int COMPOSTER_USED() { return wrapperContained.COMPOSTER_USED; }
// public void COMPOSTER_USED(int value) { wrapperContained.COMPOSTER_USED = value; }
public int LAVA_EXTINGUISHED() { return wrapperContained.LAVA_EXTINGUISHED; }
// public void LAVA_EXTINGUISHED(int value) { wrapperContained.LAVA_EXTINGUISHED = value; }
public int REDSTONE_TORCH_BURNS_OUT() { return wrapperContained.REDSTONE_TORCH_BURNS_OUT; }
// public void REDSTONE_TORCH_BURNS_OUT(int value) { wrapperContained.REDSTONE_TORCH_BURNS_OUT = value; }
public int DISPENSER_DISPENSES() { return wrapperContained.DISPENSER_DISPENSES; }
// public void DISPENSER_DISPENSES(int value) { wrapperContained.DISPENSER_DISPENSES = value; }
public int END_PORTAL_FRAME_FILLED() { return wrapperContained.END_PORTAL_FRAME_FILLED; }
// public void END_PORTAL_FRAME_FILLED(int value) { wrapperContained.END_PORTAL_FRAME_FILLED = value; }
public int POINTED_DRIPSTONE_DRIPS() { return wrapperContained.POINTED_DRIPSTONE_DRIPS; }
// public void POINTED_DRIPSTONE_DRIPS(int value) { wrapperContained.POINTED_DRIPSTONE_DRIPS = value; }
public int DISPENSER_ACTIVATED() { return wrapperContained.DISPENSER_ACTIVATED; }
// public void DISPENSER_ACTIVATED(int value) { wrapperContained.DISPENSER_ACTIVATED = value; }
public int BLOCK_BROKEN() { return wrapperContained.BLOCK_BROKEN; }
// public void BLOCK_BROKEN(int value) { wrapperContained.BLOCK_BROKEN = value; }
public int SPLASH_POTION_SPLASHED() { return wrapperContained.SPLASH_POTION_SPLASHED; }
// public void SPLASH_POTION_SPLASHED(int value) { wrapperContained.SPLASH_POTION_SPLASHED = value; }
public int EYE_OF_ENDER_BREAKS() { return wrapperContained.EYE_OF_ENDER_BREAKS; }
// public void EYE_OF_ENDER_BREAKS(int value) { wrapperContained.EYE_OF_ENDER_BREAKS = value; }
public int SPAWNER_SPAWNS_MOB() { return wrapperContained.SPAWNER_SPAWNS_MOB; }
// public void SPAWNER_SPAWNS_MOB(int value) { wrapperContained.SPAWNER_SPAWNS_MOB = value; }
public int DRAGON_BREATH_CLOUD_SPAWNS() { return wrapperContained.DRAGON_BREATH_CLOUD_SPAWNS; }
// public void DRAGON_BREATH_CLOUD_SPAWNS(int value) { wrapperContained.DRAGON_BREATH_CLOUD_SPAWNS = value; }
public int INSTANT_SPLASH_POTION_SPLASHED() { return wrapperContained.INSTANT_SPLASH_POTION_SPLASHED; }
// public void INSTANT_SPLASH_POTION_SPLASHED(int value) { wrapperContained.INSTANT_SPLASH_POTION_SPLASHED = value; }
public int ENDER_DRAGON_BREAKS_BLOCK() { return wrapperContained.ENDER_DRAGON_BREAKS_BLOCK; }
// public void ENDER_DRAGON_BREAKS_BLOCK(int value) { wrapperContained.ENDER_DRAGON_BREAKS_BLOCK = value; }
public int WET_SPONGE_DRIES_OUT() { return wrapperContained.WET_SPONGE_DRIES_OUT; }
// public void WET_SPONGE_DRIES_OUT(int value) { wrapperContained.WET_SPONGE_DRIES_OUT = value; }
public int END_GATEWAY_SPAWNS() { return wrapperContained.END_GATEWAY_SPAWNS; }
// public void END_GATEWAY_SPAWNS(int value) { wrapperContained.END_GATEWAY_SPAWNS = value; }
public int ENDER_DRAGON_RESURRECTED() { return wrapperContained.ENDER_DRAGON_RESURRECTED; }
// public void ENDER_DRAGON_RESURRECTED(int value) { wrapperContained.ENDER_DRAGON_RESURRECTED = value; }
public int ELECTRICITY_SPARKS() { return wrapperContained.ELECTRICITY_SPARKS; }
// public void ELECTRICITY_SPARKS(int value) { wrapperContained.ELECTRICITY_SPARKS = value; }
public int BLOCK_WAXED() { return wrapperContained.BLOCK_WAXED; }
// public void BLOCK_WAXED(int value) { wrapperContained.BLOCK_WAXED = value; }
public int WAX_REMOVED() { return wrapperContained.WAX_REMOVED; }
// public void WAX_REMOVED(int value) { wrapperContained.WAX_REMOVED = value; }
public int BLOCK_SCRAPED() { return wrapperContained.BLOCK_SCRAPED; }
// public void BLOCK_SCRAPED(int value) { wrapperContained.BLOCK_SCRAPED = value; }
public int DISPENSER_FAILS() { return wrapperContained.DISPENSER_FAILS; }
// public void DISPENSER_FAILS(int value) { wrapperContained.DISPENSER_FAILS = value; }
public int DISPENSER_LAUNCHES_PROJECTILE() { return wrapperContained.DISPENSER_LAUNCHES_PROJECTILE; }
// public void DISPENSER_LAUNCHES_PROJECTILE(int value) { wrapperContained.DISPENSER_LAUNCHES_PROJECTILE = value; }
public int FIREWORK_ROCKET_SHOOTS() { return wrapperContained.FIREWORK_ROCKET_SHOOTS; }
// public void FIREWORK_ROCKET_SHOOTS(int value) { wrapperContained.FIREWORK_ROCKET_SHOOTS = value; }
public int FIRE_EXTINGUISHED() { return wrapperContained.FIRE_EXTINGUISHED; }
// public void FIRE_EXTINGUISHED(int value) { wrapperContained.FIRE_EXTINGUISHED = value; }
public int GHAST_WARNS() { return wrapperContained.GHAST_WARNS; }
// public void GHAST_WARNS(int value) { wrapperContained.GHAST_WARNS = value; }
public int GHAST_SHOOTS() { return wrapperContained.GHAST_SHOOTS; }
// public void GHAST_SHOOTS(int value) { wrapperContained.GHAST_SHOOTS = value; }
public int ENDER_DRAGON_SHOOTS() { return wrapperContained.ENDER_DRAGON_SHOOTS; }
// public void ENDER_DRAGON_SHOOTS(int value) { wrapperContained.ENDER_DRAGON_SHOOTS = value; }
public int BLAZE_SHOOTS() { return wrapperContained.BLAZE_SHOOTS; }
// public void BLAZE_SHOOTS(int value) { wrapperContained.BLAZE_SHOOTS = value; }
public int ZOMBIE_ATTACKS_WOODEN_DOOR() { return wrapperContained.ZOMBIE_ATTACKS_WOODEN_DOOR; }
// public void ZOMBIE_ATTACKS_WOODEN_DOOR(int value) { wrapperContained.ZOMBIE_ATTACKS_WOODEN_DOOR = value; }
public int ZOMBIE_ATTACKS_IRON_DOOR() { return wrapperContained.ZOMBIE_ATTACKS_IRON_DOOR; }
// public void ZOMBIE_ATTACKS_IRON_DOOR(int value) { wrapperContained.ZOMBIE_ATTACKS_IRON_DOOR = value; }
public int ZOMBIE_BREAKS_WOODEN_DOOR() { return wrapperContained.ZOMBIE_BREAKS_WOODEN_DOOR; }
// public void ZOMBIE_BREAKS_WOODEN_DOOR(int value) { wrapperContained.ZOMBIE_BREAKS_WOODEN_DOOR = value; }
public int WITHER_BREAKS_BLOCK() { return wrapperContained.WITHER_BREAKS_BLOCK; }
// public void WITHER_BREAKS_BLOCK(int value) { wrapperContained.WITHER_BREAKS_BLOCK = value; }
public int WITHER_SPAWNS() { return wrapperContained.WITHER_SPAWNS; }
// public void WITHER_SPAWNS(int value) { wrapperContained.WITHER_SPAWNS = value; }
public int WITHER_SHOOTS() { return wrapperContained.WITHER_SHOOTS; }
// public void WITHER_SHOOTS(int value) { wrapperContained.WITHER_SHOOTS = value; }
public int BAT_TAKES_OFF() { return wrapperContained.BAT_TAKES_OFF; }
// public void BAT_TAKES_OFF(int value) { wrapperContained.BAT_TAKES_OFF = value; }
public int BONE_MEAL_USED() { return wrapperContained.BONE_MEAL_USED; }
// public void BONE_MEAL_USED(int value) { wrapperContained.BONE_MEAL_USED = value; }
public int SCULK_CHARGE() { return wrapperContained.SCULK_CHARGE; }
// public void SCULK_CHARGE(int value) { wrapperContained.SCULK_CHARGE = value; }
public int SCULK_SHRIEKS() { return wrapperContained.SCULK_SHRIEKS; }
// public void SCULK_SHRIEKS(int value) { wrapperContained.SCULK_SHRIEKS = value; }
public int BLOCK_FINISHED_BRUSHING() { return wrapperContained.BLOCK_FINISHED_BRUSHING; }
// public void BLOCK_FINISHED_BRUSHING(int value) { wrapperContained.BLOCK_FINISHED_BRUSHING = value; }
public int JUKEBOX_STARTS_PLAYING() { return wrapperContained.JUKEBOX_STARTS_PLAYING; }
// public void JUKEBOX_STARTS_PLAYING(int value) { wrapperContained.JUKEBOX_STARTS_PLAYING = value; }
public int JUKEBOX_STOPS_PLAYING() { return wrapperContained.JUKEBOX_STOPS_PLAYING; }
// public void JUKEBOX_STOPS_PLAYING(int value) { wrapperContained.JUKEBOX_STOPS_PLAYING = value; }
public int SNIFFER_EGG_CRACKS() { return wrapperContained.SNIFFER_EGG_CRACKS; }
// public void SNIFFER_EGG_CRACKS(int value) { wrapperContained.SNIFFER_EGG_CRACKS = value; }
public int CRAFTER_CRAFTS() { return wrapperContained.CRAFTER_CRAFTS; }
// public void CRAFTER_CRAFTS(int value) { wrapperContained.CRAFTER_CRAFTS = value; }
public int CRAFTER_FAILS() { return wrapperContained.CRAFTER_FAILS; }
// public void CRAFTER_FAILS(int value) { wrapperContained.CRAFTER_FAILS = value; }
public int CRAFTER_SHOOTS() { return wrapperContained.CRAFTER_SHOOTS; }
// public void CRAFTER_SHOOTS(int value) { wrapperContained.CRAFTER_SHOOTS = value; }
public int TRIAL_SPAWNER_SPAWNS_MOB() { return wrapperContained.TRIAL_SPAWNER_SPAWNS_MOB; }
// public void TRIAL_SPAWNER_SPAWNS_MOB(int value) { wrapperContained.TRIAL_SPAWNER_SPAWNS_MOB = value; }
public int TRIAL_SPAWNER_SPAWNS_MOB_AT_SPAWN_POS() { return wrapperContained.TRIAL_SPAWNER_SPAWNS_MOB_AT_SPAWN_POS; }
// public void TRIAL_SPAWNER_SPAWNS_MOB_AT_SPAWN_POS(int value) { wrapperContained.TRIAL_SPAWNER_SPAWNS_MOB_AT_SPAWN_POS = value; }
public int TRIAL_SPAWNER_DETECTS_PLAYER() { return wrapperContained.TRIAL_SPAWNER_DETECTS_PLAYER; }
// public void TRIAL_SPAWNER_DETECTS_PLAYER(int value) { wrapperContained.TRIAL_SPAWNER_DETECTS_PLAYER = value; }
public int TRIAL_SPAWNER_EJECTS_ITEM() { return wrapperContained.TRIAL_SPAWNER_EJECTS_ITEM; }
// public void TRIAL_SPAWNER_EJECTS_ITEM(int value) { wrapperContained.TRIAL_SPAWNER_EJECTS_ITEM = value; }
public int BEE_FERTILIZES_PLANT() { return wrapperContained.BEE_FERTILIZES_PLANT; }
// public void BEE_FERTILIZES_PLANT(int value) { wrapperContained.BEE_FERTILIZES_PLANT = value; }
public int TURTLE_EGG_PLACED() { return wrapperContained.TURTLE_EGG_PLACED; }
// public void TURTLE_EGG_PLACED(int value) { wrapperContained.TURTLE_EGG_PLACED = value; }
public int VAULT_ACTIVATES() { return wrapperContained.VAULT_ACTIVATES; }
// public void VAULT_ACTIVATES(int value) { wrapperContained.VAULT_ACTIVATES = value; }
public int VAULT_DEACTIVATES() { return wrapperContained.VAULT_DEACTIVATES; }
// public void VAULT_DEACTIVATES(int value) { wrapperContained.VAULT_DEACTIVATES = value; }
public int VAULT_EJECTS_ITEM() { return wrapperContained.VAULT_EJECTS_ITEM; }
// public void VAULT_EJECTS_ITEM(int value) { wrapperContained.VAULT_EJECTS_ITEM = value; }
public int COBWEB_WEAVED() { return wrapperContained.COBWEB_WEAVED; }
// public void COBWEB_WEAVED(int value) { wrapperContained.COBWEB_WEAVED = value; }
public int OMINOUS_TRIAL_SPAWNER_DETECTS_PLAYER() { return wrapperContained.OMINOUS_TRIAL_SPAWNER_DETECTS_PLAYER; }
// public void OMINOUS_TRIAL_SPAWNER_DETECTS_PLAYER(int value) { wrapperContained.OMINOUS_TRIAL_SPAWNER_DETECTS_PLAYER = value; }
public int TRIAL_SPAWNER_TURNS_OMINOUS() { return wrapperContained.TRIAL_SPAWNER_TURNS_OMINOUS; }
// public void TRIAL_SPAWNER_TURNS_OMINOUS(int value) { wrapperContained.TRIAL_SPAWNER_TURNS_OMINOUS = value; }
public int OMINOUS_ITEM_SPAWNER_SPAWNS_ITEM() { return wrapperContained.OMINOUS_ITEM_SPAWNER_SPAWNS_ITEM; }
// public void OMINOUS_ITEM_SPAWNER_SPAWNS_ITEM(int value) { wrapperContained.OMINOUS_ITEM_SPAWNER_SPAWNS_ITEM = value; }
public int SMASH_ATTACK() { return wrapperContained.SMASH_ATTACK; }
// public void SMASH_ATTACK(int value) { wrapperContained.SMASH_ATTACK = value; }

}