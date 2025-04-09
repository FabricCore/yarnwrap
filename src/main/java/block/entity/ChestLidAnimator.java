package yarnwrap.block.entity;
public class ChestLidAnimator { public net.minecraft.block.entity.ChestLidAnimator wrapperContained; public ChestLidAnimator(net.minecraft.block.entity.ChestLidAnimator wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean open() { return wrapperContained.open; }
// public float progress() { return wrapperContained.progress; }
// public float lastProgress() { return wrapperContained.lastProgress; }
public void step() { wrapperContained.step(); }
public float getProgress(float delta) { return wrapperContained.getProgress(delta); }
public void setOpen(boolean open) { wrapperContained.setOpen(open); }

}