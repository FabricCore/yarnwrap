package yarnwrap.entity.passive;
public class StriderEntity { public net.minecraft.entity.passive.StriderEntity wrapperContained; public StriderEntity(net.minecraft.entity.passive.StriderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.SaddledComponent saddledComponent() { return new yarnwrap.entity.SaddledComponent(wrapperContained.saddledComponent); }
// public void saddledComponent(yarnwrap.entity.SaddledComponent value) { wrapperContained.saddledComponent = value.wrapperContained; }
// public static yarnwrap.entity.SaddledComponent saddledComponent() { return new yarnwrap.entity.SaddledComponent(net.minecraft.entity.passive.StriderEntity.saddledComponent); }
// public static void saddledComponent(yarnwrap.entity.SaddledComponent value, ) { net.minecraft.entity.passive.StriderEntity.saddledComponent = value.wrapperContained; }

// public yarnwrap.entity.ai.goal.TemptGoal temptGoal() { return new yarnwrap.entity.ai.goal.TemptGoal(wrapperContained.temptGoal); }
// public void temptGoal(yarnwrap.entity.ai.goal.TemptGoal value) { wrapperContained.temptGoal = value.wrapperContained; }
// public static yarnwrap.entity.ai.goal.TemptGoal temptGoal() { return new yarnwrap.entity.ai.goal.TemptGoal(net.minecraft.entity.passive.StriderEntity.temptGoal); }
// public static void temptGoal(yarnwrap.entity.ai.goal.TemptGoal value, ) { net.minecraft.entity.passive.StriderEntity.temptGoal = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData BOOST_TIME() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BOOST_TIME); }
// public void BOOST_TIME(yarnwrap.entity.data.TrackedData value) { wrapperContained.BOOST_TIME = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData BOOST_TIME() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.StriderEntity.BOOST_TIME); }
// public static void BOOST_TIME(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.StriderEntity.BOOST_TIME = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData COLD() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLD); }
// public void COLD(yarnwrap.entity.data.TrackedData value) { wrapperContained.COLD = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData COLD() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.StriderEntity.COLD); }
// public static void COLD(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.StriderEntity.COLD = value.wrapperContained; }

// public float COLD_SADDLED_SPEED() { return wrapperContained.COLD_SADDLED_SPEED; }
// public void COLD_SADDLED_SPEED(float value) { wrapperContained.COLD_SADDLED_SPEED = value; }
// public static float COLD_SADDLED_SPEED() { return net.minecraft.entity.passive.StriderEntity.COLD_SADDLED_SPEED; }
// public static void COLD_SADDLED_SPEED(float value, ) { net.minecraft.entity.passive.StriderEntity.COLD_SADDLED_SPEED = value; }

// public float DEFAULT_SADDLED_SPEED() { return wrapperContained.DEFAULT_SADDLED_SPEED; }
// public void DEFAULT_SADDLED_SPEED(float value) { wrapperContained.DEFAULT_SADDLED_SPEED = value; }
// public static float DEFAULT_SADDLED_SPEED() { return net.minecraft.entity.passive.StriderEntity.DEFAULT_SADDLED_SPEED; }
// public static void DEFAULT_SADDLED_SPEED(float value, ) { net.minecraft.entity.passive.StriderEntity.DEFAULT_SADDLED_SPEED = value; }

// public yarnwrap.util.Identifier SUFFOCATING_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.SUFFOCATING_MODIFIER_ID); }
// public void SUFFOCATING_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.SUFFOCATING_MODIFIER_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier SUFFOCATING_MODIFIER_ID() { return new yarnwrap.util.Identifier(net.minecraft.entity.passive.StriderEntity.SUFFOCATING_MODIFIER_ID); }
// public static void SUFFOCATING_MODIFIER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.entity.passive.StriderEntity.SUFFOCATING_MODIFIER_ID = value.wrapperContained; }

// public yarnwrap.entity.attribute.EntityAttributeModifier SUFFOCATING_MODIFIER() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.SUFFOCATING_MODIFIER); }
// public void SUFFOCATING_MODIFIER(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.SUFFOCATING_MODIFIER = value.wrapperContained; }
// public static yarnwrap.entity.attribute.EntityAttributeModifier SUFFOCATING_MODIFIER() { return new yarnwrap.entity.attribute.EntityAttributeModifier(net.minecraft.entity.passive.StriderEntity.SUFFOCATING_MODIFIER); }
// public static void SUFFOCATING_MODIFIER(yarnwrap.entity.attribute.EntityAttributeModifier value, ) { net.minecraft.entity.passive.StriderEntity.SUFFOCATING_MODIFIER = value.wrapperContained; }

// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.StriderEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public void updateFloating() { wrapperContained.updateFloating(); }
// public static void updateFloating() { net.minecraft.entity.passive.StriderEntity.updateFloating(); }
public boolean isCold() { return wrapperContained.isCold(); }
// public static boolean isCold() { return net.minecraft.entity.passive.StriderEntity.isCold(); }
public void setCold(boolean cold) { wrapperContained.setCold(cold); }
// public static void setCold(boolean cold, ) { net.minecraft.entity.passive.StriderEntity.setCold(cold); }
// public Object createStriderAttributes() { return wrapperContained.createStriderAttributes(); }
public static Object createStriderAttributes() { return net.minecraft.entity.passive.StriderEntity.createStriderAttributes(); }
// public boolean isBeingTempted() { return wrapperContained.isBeingTempted(); }
// public static boolean isBeingTempted() { return net.minecraft.entity.passive.StriderEntity.isBeingTempted(); }
// public yarnwrap.entity.EntityData initializeRider(yarnwrap.world.ServerWorldAccess world,yarnwrap.world.LocalDifficulty difficulty,yarnwrap.entity.mob.MobEntity rider,yarnwrap.entity.EntityData entityData) { return new yarnwrap.entity.EntityData(wrapperContained.initializeRider(world.wrapperContained,difficulty.wrapperContained,rider.wrapperContained,entityData.wrapperContained)); }
// public static yarnwrap.entity.EntityData initializeRider(yarnwrap.world.ServerWorldAccess world,yarnwrap.world.LocalDifficulty difficulty,yarnwrap.entity.mob.MobEntity rider,yarnwrap.entity.EntityData entityData, ) { return new yarnwrap.entity.EntityData(net.minecraft.entity.passive.StriderEntity.initializeRider(world.wrapperContained,difficulty.wrapperContained,rider.wrapperContained,entityData.wrapperContained)); }
// public boolean method_58395(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58395(stack.wrapperContained); }
// public static boolean method_58395(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.StriderEntity.method_58395(stack.wrapperContained); }

}