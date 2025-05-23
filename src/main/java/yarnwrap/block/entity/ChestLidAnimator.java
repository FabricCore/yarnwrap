package yarnwrap.block.entity;
public class ChestLidAnimator { public net.minecraft.block.entity.ChestLidAnimator wrapperContained; public ChestLidAnimator(net.minecraft.block.entity.ChestLidAnimator wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean open() { return wrapperContained.open; }
// public void open(boolean value) { wrapperContained.open = value; }
// public static boolean open() { return net.minecraft.block.entity.ChestLidAnimator.open; }
// public static void open(boolean value, ) { net.minecraft.block.entity.ChestLidAnimator.open = value; }

// public float progress() { return wrapperContained.progress; }
// public void progress(float value) { wrapperContained.progress = value; }
// public static float progress() { return net.minecraft.block.entity.ChestLidAnimator.progress; }
// public static void progress(float value, ) { net.minecraft.block.entity.ChestLidAnimator.progress = value; }

// public float lastProgress() { return wrapperContained.lastProgress; }
// public void lastProgress(float value) { wrapperContained.lastProgress = value; }
// public static float lastProgress() { return net.minecraft.block.entity.ChestLidAnimator.lastProgress; }
// public static void lastProgress(float value, ) { net.minecraft.block.entity.ChestLidAnimator.lastProgress = value; }

public void step() { wrapperContained.step(); }
// public static void step() { net.minecraft.block.entity.ChestLidAnimator.step(); }
public float getProgress(float tickProgress) { return wrapperContained.getProgress(tickProgress); }
// public static float getProgress(float tickProgress, ) { return net.minecraft.block.entity.ChestLidAnimator.getProgress(tickProgress); }
public void setOpen(boolean open) { wrapperContained.setOpen(open); }
// public static void setOpen(boolean open, ) { net.minecraft.block.entity.ChestLidAnimator.setOpen(open); }

}