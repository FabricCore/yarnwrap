package yarnwrap.item;
public class CrossbowItem { public net.minecraft.item.CrossbowItem wrapperContained; public CrossbowItem(net.minecraft.item.CrossbowItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean loaded() { return wrapperContained.loaded; }
// public void loaded(boolean value) { wrapperContained.loaded = value; }
// public static boolean loaded() { return net.minecraft.item.CrossbowItem.loaded; }
// public static void loaded(boolean value, ) { net.minecraft.item.CrossbowItem.loaded = value; }

// public boolean charged() { return wrapperContained.charged; }
// public void charged(boolean value) { wrapperContained.charged = value; }
// public static boolean charged() { return net.minecraft.item.CrossbowItem.charged; }
// public static void charged(boolean value, ) { net.minecraft.item.CrossbowItem.charged = value; }

// public int RANGE() { return wrapperContained.RANGE; }
// public void RANGE(int value) { wrapperContained.RANGE = value; }
public static int RANGE() { return net.minecraft.item.CrossbowItem.RANGE; }
// public static void RANGE(int value, ) { net.minecraft.item.CrossbowItem.RANGE = value; }

// public float DEFAULT_PULL_TIME() { return wrapperContained.DEFAULT_PULL_TIME; }
// public void DEFAULT_PULL_TIME(float value) { wrapperContained.DEFAULT_PULL_TIME = value; }
// public static float DEFAULT_PULL_TIME() { return net.minecraft.item.CrossbowItem.DEFAULT_PULL_TIME; }
// public static void DEFAULT_PULL_TIME(float value, ) { net.minecraft.item.CrossbowItem.DEFAULT_PULL_TIME = value; }

// public float CHARGE_PROGRESS() { return wrapperContained.CHARGE_PROGRESS; }
// public void CHARGE_PROGRESS(float value) { wrapperContained.CHARGE_PROGRESS = value; }
// public static float CHARGE_PROGRESS() { return net.minecraft.item.CrossbowItem.CHARGE_PROGRESS; }
// public static void CHARGE_PROGRESS(float value, ) { net.minecraft.item.CrossbowItem.CHARGE_PROGRESS = value; }

// public float LOAD_PROGRESS() { return wrapperContained.LOAD_PROGRESS; }
// public void LOAD_PROGRESS(float value) { wrapperContained.LOAD_PROGRESS = value; }
// public static float LOAD_PROGRESS() { return net.minecraft.item.CrossbowItem.LOAD_PROGRESS; }
// public static void LOAD_PROGRESS(float value, ) { net.minecraft.item.CrossbowItem.LOAD_PROGRESS = value; }

// public float DEFAULT_SPEED() { return wrapperContained.DEFAULT_SPEED; }
// public void DEFAULT_SPEED(float value) { wrapperContained.DEFAULT_SPEED = value; }
// public static float DEFAULT_SPEED() { return net.minecraft.item.CrossbowItem.DEFAULT_SPEED; }
// public static void DEFAULT_SPEED(float value, ) { net.minecraft.item.CrossbowItem.DEFAULT_SPEED = value; }

// public float FIREWORK_ROCKET_SPEED() { return wrapperContained.FIREWORK_ROCKET_SPEED; }
// public void FIREWORK_ROCKET_SPEED(float value) { wrapperContained.FIREWORK_ROCKET_SPEED = value; }
// public static float FIREWORK_ROCKET_SPEED() { return net.minecraft.item.CrossbowItem.FIREWORK_ROCKET_SPEED; }
// public static void FIREWORK_ROCKET_SPEED(float value, ) { net.minecraft.item.CrossbowItem.FIREWORK_ROCKET_SPEED = value; }

// public Object DEFAULT_LOADING_SOUNDS() { return wrapperContained.DEFAULT_LOADING_SOUNDS; }
// // public void DEFAULT_LOADING_SOUNDS(Object value) { wrapperContained.DEFAULT_LOADING_SOUNDS = value; }
// // public static Object DEFAULT_LOADING_SOUNDS() { return net.minecraft.item.CrossbowItem.DEFAULT_LOADING_SOUNDS; }
// // public static void DEFAULT_LOADING_SOUNDS(Object value, ) { net.minecraft.item.CrossbowItem.DEFAULT_LOADING_SOUNDS = value; }

// public boolean loadProjectiles(yarnwrap.entity.LivingEntity shooter,yarnwrap.item.ItemStack crossbow) { return wrapperContained.loadProjectiles(shooter.wrapperContained,crossbow.wrapperContained); }
// public static boolean loadProjectiles(yarnwrap.entity.LivingEntity shooter,yarnwrap.item.ItemStack crossbow, ) { return net.minecraft.item.CrossbowItem.loadProjectiles(shooter.wrapperContained,crossbow.wrapperContained); }
// public float getPullProgress(int useTicks,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user) { return wrapperContained.getPullProgress(useTicks,stack.wrapperContained,user.wrapperContained); }
// public static float getPullProgress(int useTicks,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user, ) { return net.minecraft.item.CrossbowItem.getPullProgress(useTicks,stack.wrapperContained,user.wrapperContained); }
// public int getPullTime(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user) { return wrapperContained.getPullTime(stack.wrapperContained,user.wrapperContained); }
// public static int getPullTime(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user, ) { return net.minecraft.item.CrossbowItem.getPullTime(stack.wrapperContained,user.wrapperContained); }
public void shootAll(yarnwrap.world.World world,yarnwrap.entity.LivingEntity shooter,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack,float speed,float divergence,yarnwrap.entity.LivingEntity target) { wrapperContained.shootAll(world.wrapperContained,shooter.wrapperContained,hand.wrapperContained,stack.wrapperContained,speed,divergence,target.wrapperContained); }
// public static void shootAll(yarnwrap.world.World world,yarnwrap.entity.LivingEntity shooter,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack,float speed,float divergence,yarnwrap.entity.LivingEntity target, ) { net.minecraft.item.CrossbowItem.shootAll(world.wrapperContained,shooter.wrapperContained,hand.wrapperContained,stack.wrapperContained,speed,divergence,target.wrapperContained); }
// public boolean isCharged(yarnwrap.item.ItemStack stack) { return wrapperContained.isCharged(stack.wrapperContained); }
// public static boolean isCharged(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.CrossbowItem.isCharged(stack.wrapperContained); }
// public float getSoundPitch(boolean flag,yarnwrap.util.math.random.Random random) { return wrapperContained.getSoundPitch(flag,random.wrapperContained); }
// public static float getSoundPitch(boolean flag,yarnwrap.util.math.random.Random random, ) { return net.minecraft.item.CrossbowItem.getSoundPitch(flag,random.wrapperContained); }
// public float getSpeed(yarnwrap.component.type.ChargedProjectilesComponent stack) { return wrapperContained.getSpeed(stack.wrapperContained); }
// public static float getSpeed(yarnwrap.component.type.ChargedProjectilesComponent stack, ) { return net.minecraft.item.CrossbowItem.getSpeed(stack.wrapperContained); }
// public float getSoundPitch(yarnwrap.util.math.random.Random random,int index) { return wrapperContained.getSoundPitch(random.wrapperContained,index); }
// public static float getSoundPitch(yarnwrap.util.math.random.Random random,int index, ) { return net.minecraft.item.CrossbowItem.getSoundPitch(random.wrapperContained,index); }
// public org.joml.Vector3f calcVelocity(yarnwrap.entity.LivingEntity shooter,yarnwrap.util.math.Vec3d direction,float yaw) { return wrapperContained.calcVelocity(shooter.wrapperContained,direction.wrapperContained,yaw); }
// public static org.joml.Vector3f calcVelocity(yarnwrap.entity.LivingEntity shooter,yarnwrap.util.math.Vec3d direction,float yaw, ) { return net.minecraft.item.CrossbowItem.calcVelocity(shooter.wrapperContained,direction.wrapperContained,yaw); }
// public void method_59973(yarnwrap.world.World sound) { wrapperContained.method_59973(sound.wrapperContained); }
// public static void method_59973(yarnwrap.world.World sound, ) { net.minecraft.item.CrossbowItem.method_59973(sound.wrapperContained); }
// public void method_59974(yarnwrap.world.World sound) { wrapperContained.method_59974(sound.wrapperContained); }
// public static void method_59974(yarnwrap.world.World sound, ) { net.minecraft.item.CrossbowItem.method_59974(sound.wrapperContained); }
// public Object getLoadingSounds(yarnwrap.item.ItemStack stack) { return wrapperContained.getLoadingSounds(stack.wrapperContained); }
// public static Object getLoadingSounds(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.CrossbowItem.getLoadingSounds(stack.wrapperContained); }
// public void method_67186(yarnwrap.world.World sound) { wrapperContained.method_67186(sound.wrapperContained); }
// public static void method_67186(yarnwrap.world.World sound, ) { net.minecraft.item.CrossbowItem.method_67186(sound.wrapperContained); }

}