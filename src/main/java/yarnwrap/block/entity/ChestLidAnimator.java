package yarnwrap.block.entity;
public class ChestLidAnimator { public net.minecraft.block.entity.ChestLidAnimator wrapperContained; public ChestLidAnimator(net.minecraft.block.entity.ChestLidAnimator wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean open() { return wrapperContained.open; }
// public void open(boolean value) { wrapperContained.open = value; }
// public float progress() { return wrapperContained.progress; }
// public void progress(float value) { wrapperContained.progress = value; }
// public float lastProgress() { return wrapperContained.lastProgress; }
// public void lastProgress(float value) { wrapperContained.lastProgress = value; }
public void step() { wrapperContained.step(); }
public float getProgress(float delta) { return wrapperContained.getProgress(delta); }
public void setOpen(boolean open) { wrapperContained.setOpen(open); }

}