package yarnwrap.world.spawner;
public class PhantomSpawner { public net.minecraft.world.spawner.PhantomSpawner wrapperContained; public PhantomSpawner(net.minecraft.world.spawner.PhantomSpawner wrapperContained) { this.wrapperContained = wrapperContained; }

// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public static int cooldown() { return net.minecraft.world.spawner.PhantomSpawner.cooldown; }
// public static void cooldown(int value, ) { net.minecraft.world.spawner.PhantomSpawner.cooldown = value; }


}