package yarnwrap.world;
public class CommandBlockExecutor { public net.minecraft.world.CommandBlockExecutor wrapperContained; public CommandBlockExecutor(net.minecraft.world.CommandBlockExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text DEFAULT_NAME() { return new yarnwrap.text.Text(wrapperContained.DEFAULT_NAME); }
// public void DEFAULT_NAME(yarnwrap.text.Text value) { wrapperContained.DEFAULT_NAME = value.wrapperContained; }
// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
// public void customName(yarnwrap.text.Text value) { wrapperContained.customName = value.wrapperContained; }
// public int successCount() { return wrapperContained.successCount; }
// public void successCount(int value) { wrapperContained.successCount = value; }
// public boolean trackOutput() { return wrapperContained.trackOutput; }
// public void trackOutput(boolean value) { wrapperContained.trackOutput = value; }
// public yarnwrap.text.Text lastOutput() { return new yarnwrap.text.Text(wrapperContained.lastOutput); }
// public void lastOutput(yarnwrap.text.Text value) { wrapperContained.lastOutput = value.wrapperContained; }
// public boolean updateLastExecution() { return wrapperContained.updateLastExecution; }
// public void updateLastExecution(boolean value) { wrapperContained.updateLastExecution = value; }
// public long lastExecution() { return wrapperContained.lastExecution; }
// public void lastExecution(long value) { wrapperContained.lastExecution = value; }
// public java.lang.String command() { return wrapperContained.command; }
// public void command(java.lang.String value) { wrapperContained.command = value; }
// public java.text.SimpleDateFormat DATE_FORMAT() { return wrapperContained.DATE_FORMAT; }
// public void DATE_FORMAT(java.text.SimpleDateFormat value) { wrapperContained.DATE_FORMAT = value; }
public boolean isEditable() { return wrapperContained.isEditable(); }
public yarnwrap.text.Text getCustomNameNullable() { return new yarnwrap.text.Text(wrapperContained.getCustomNameNullable()); }
public void setCommand(java.lang.String command) { wrapperContained.setCommand(command); }
public void setTrackOutput(boolean trackOutput) { wrapperContained.setTrackOutput(trackOutput); }
public yarnwrap.util.ActionResult interact(yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.util.ActionResult(wrapperContained.interact(player.wrapperContained)); }
public java.lang.String getCommand() { return wrapperContained.getCommand(); }
public void setCustomName(yarnwrap.text.Text customName) { wrapperContained.setCustomName(customName.wrapperContained); }
public void setLastOutput(yarnwrap.text.Text lastOutput) { wrapperContained.setLastOutput(lastOutput.wrapperContained); }
public yarnwrap.text.Text getLastOutput() { return new yarnwrap.text.Text(wrapperContained.getLastOutput()); }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
public void markDirty() { wrapperContained.markDirty(); }
public boolean isTrackingOutput() { return wrapperContained.isTrackingOutput(); }
// public yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt,Object registries) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeNbt(nbt.wrapperContained,registries)); }
public void setSuccessCount(int successCount) { wrapperContained.setSuccessCount(successCount); }
public yarnwrap.text.Text getCustomName() { return new yarnwrap.text.Text(wrapperContained.getCustomName()); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
public boolean execute(yarnwrap.world.World world) { return wrapperContained.execute(world.wrapperContained); }
public yarnwrap.server.command.ServerCommandSource getSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getSource()); }
public int getSuccessCount() { return wrapperContained.getSuccessCount(); }
// public void readNbt(yarnwrap.nbt.NbtCompound nbt,Object registries) { wrapperContained.readNbt(nbt.wrapperContained,registries); }

}