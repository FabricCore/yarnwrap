package yarnwrap.world;
public class CommandBlockExecutor { public net.minecraft.world.CommandBlockExecutor wrapperContained; public CommandBlockExecutor(net.minecraft.world.CommandBlockExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
// public void customName(yarnwrap.text.Text value) { wrapperContained.customName = value.wrapperContained; }
// public static yarnwrap.text.Text customName() { return new yarnwrap.text.Text(net.minecraft.world.CommandBlockExecutor.customName); }
// public static void customName(yarnwrap.text.Text value, ) { net.minecraft.world.CommandBlockExecutor.customName = value.wrapperContained; }

// public int successCount() { return wrapperContained.successCount; }
// public void successCount(int value) { wrapperContained.successCount = value; }
// public static int successCount() { return net.minecraft.world.CommandBlockExecutor.successCount; }
// public static void successCount(int value, ) { net.minecraft.world.CommandBlockExecutor.successCount = value; }

// public boolean trackOutput() { return wrapperContained.trackOutput; }
// public void trackOutput(boolean value) { wrapperContained.trackOutput = value; }
// public static boolean trackOutput() { return net.minecraft.world.CommandBlockExecutor.trackOutput; }
// public static void trackOutput(boolean value, ) { net.minecraft.world.CommandBlockExecutor.trackOutput = value; }

// public yarnwrap.text.Text lastOutput() { return new yarnwrap.text.Text(wrapperContained.lastOutput); }
// public void lastOutput(yarnwrap.text.Text value) { wrapperContained.lastOutput = value.wrapperContained; }
// public static yarnwrap.text.Text lastOutput() { return new yarnwrap.text.Text(net.minecraft.world.CommandBlockExecutor.lastOutput); }
// public static void lastOutput(yarnwrap.text.Text value, ) { net.minecraft.world.CommandBlockExecutor.lastOutput = value.wrapperContained; }

// public boolean updateLastExecution() { return wrapperContained.updateLastExecution; }
// public void updateLastExecution(boolean value) { wrapperContained.updateLastExecution = value; }
// public static boolean updateLastExecution() { return net.minecraft.world.CommandBlockExecutor.updateLastExecution; }
// public static void updateLastExecution(boolean value, ) { net.minecraft.world.CommandBlockExecutor.updateLastExecution = value; }

// public long lastExecution() { return wrapperContained.lastExecution; }
// public void lastExecution(long value) { wrapperContained.lastExecution = value; }
// public static long lastExecution() { return net.minecraft.world.CommandBlockExecutor.lastExecution; }
// public static void lastExecution(long value, ) { net.minecraft.world.CommandBlockExecutor.lastExecution = value; }

// public java.lang.String command() { return wrapperContained.command; }
// public void command(java.lang.String value) { wrapperContained.command = value; }
// public static java.lang.String command() { return net.minecraft.world.CommandBlockExecutor.command; }
// public static void command(java.lang.String value, ) { net.minecraft.world.CommandBlockExecutor.command = value; }

// public java.text.SimpleDateFormat DATE_FORMAT() { return wrapperContained.DATE_FORMAT; }
// public void DATE_FORMAT(java.text.SimpleDateFormat value) { wrapperContained.DATE_FORMAT = value; }
// public static java.text.SimpleDateFormat DATE_FORMAT() { return net.minecraft.world.CommandBlockExecutor.DATE_FORMAT; }
// public static void DATE_FORMAT(java.text.SimpleDateFormat value, ) { net.minecraft.world.CommandBlockExecutor.DATE_FORMAT = value; }

// public yarnwrap.text.Text DEFAULT_NAME() { return new yarnwrap.text.Text(wrapperContained.DEFAULT_NAME); }
// public void DEFAULT_NAME(yarnwrap.text.Text value) { wrapperContained.DEFAULT_NAME = value.wrapperContained; }
// public static yarnwrap.text.Text DEFAULT_NAME() { return new yarnwrap.text.Text(net.minecraft.world.CommandBlockExecutor.DEFAULT_NAME); }
// public static void DEFAULT_NAME(yarnwrap.text.Text value, ) { net.minecraft.world.CommandBlockExecutor.DEFAULT_NAME = value.wrapperContained; }

// public int DEFAULT_LAST_EXECUTION() { return wrapperContained.DEFAULT_LAST_EXECUTION; }
// public void DEFAULT_LAST_EXECUTION(int value) { wrapperContained.DEFAULT_LAST_EXECUTION = value; }
// public static int DEFAULT_LAST_EXECUTION() { return net.minecraft.world.CommandBlockExecutor.DEFAULT_LAST_EXECUTION; }
// public static void DEFAULT_LAST_EXECUTION(int value, ) { net.minecraft.world.CommandBlockExecutor.DEFAULT_LAST_EXECUTION = value; }

public void setCommand(java.lang.String command) { wrapperContained.setCommand(command); }
// public static void setCommand(java.lang.String command, ) { net.minecraft.world.CommandBlockExecutor.setCommand(command); }
public void setTrackOutput(boolean trackOutput) { wrapperContained.setTrackOutput(trackOutput); }
// public static void setTrackOutput(boolean trackOutput, ) { net.minecraft.world.CommandBlockExecutor.setTrackOutput(trackOutput); }
public yarnwrap.util.ActionResult interact(yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.util.ActionResult(wrapperContained.interact(player.wrapperContained)); }
// public static yarnwrap.util.ActionResult interact(yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.util.ActionResult(net.minecraft.world.CommandBlockExecutor.interact(player.wrapperContained)); }
public java.lang.String getCommand() { return wrapperContained.getCommand(); }
// public static java.lang.String getCommand() { return net.minecraft.world.CommandBlockExecutor.getCommand(); }
public void setCustomName(yarnwrap.text.Text customName) { wrapperContained.setCustomName(customName.wrapperContained); }
// public static void setCustomName(yarnwrap.text.Text customName, ) { net.minecraft.world.CommandBlockExecutor.setCustomName(customName.wrapperContained); }
public void setLastOutput(yarnwrap.text.Text lastOutput) { wrapperContained.setLastOutput(lastOutput.wrapperContained); }
// public static void setLastOutput(yarnwrap.text.Text lastOutput, ) { net.minecraft.world.CommandBlockExecutor.setLastOutput(lastOutput.wrapperContained); }
public yarnwrap.text.Text getLastOutput() { return new yarnwrap.text.Text(wrapperContained.getLastOutput()); }
// public static yarnwrap.text.Text getLastOutput() { return new yarnwrap.text.Text(net.minecraft.world.CommandBlockExecutor.getLastOutput()); }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
// public static yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(net.minecraft.world.CommandBlockExecutor.getWorld()); }
// public void method_8294(boolean successful,int returnValue) { wrapperContained.method_8294(successful,returnValue); }
// public static void method_8294(boolean successful,int returnValue, ) { net.minecraft.world.CommandBlockExecutor.method_8294(successful,returnValue); }
public void markDirty() { wrapperContained.markDirty(); }
// public static void markDirty() { net.minecraft.world.CommandBlockExecutor.markDirty(); }
public boolean isTrackingOutput() { return wrapperContained.isTrackingOutput(); }
// public static boolean isTrackingOutput() { return net.minecraft.world.CommandBlockExecutor.isTrackingOutput(); }
// public void writeData(yarnwrap.storage.WriteView view) { wrapperContained.writeData(view.wrapperContained); }
// public static void writeData(yarnwrap.storage.WriteView view, ) { net.minecraft.world.CommandBlockExecutor.writeData(view.wrapperContained); }
public void setSuccessCount(int successCount) { wrapperContained.setSuccessCount(successCount); }
// public static void setSuccessCount(int successCount, ) { net.minecraft.world.CommandBlockExecutor.setSuccessCount(successCount); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.world.CommandBlockExecutor.getName()); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
// public static yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.world.CommandBlockExecutor.getPos()); }
public boolean execute(yarnwrap.world.World world) { return wrapperContained.execute(world.wrapperContained); }
// public static boolean execute(yarnwrap.world.World world, ) { return net.minecraft.world.CommandBlockExecutor.execute(world.wrapperContained); }
public yarnwrap.server.command.ServerCommandSource getSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getSource()); }
// public static yarnwrap.server.command.ServerCommandSource getSource() { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.world.CommandBlockExecutor.getSource()); }
public int getSuccessCount() { return wrapperContained.getSuccessCount(); }
// public static int getSuccessCount() { return net.minecraft.world.CommandBlockExecutor.getSuccessCount(); }
// public void readData(yarnwrap.storage.ReadView view) { wrapperContained.readData(view.wrapperContained); }
// public static void readData(yarnwrap.storage.ReadView view, ) { net.minecraft.world.CommandBlockExecutor.readData(view.wrapperContained); }
public boolean isEditable() { return wrapperContained.isEditable(); }
// public static boolean isEditable() { return net.minecraft.world.CommandBlockExecutor.isEditable(); }
public yarnwrap.text.Text getCustomName() { return new yarnwrap.text.Text(wrapperContained.getCustomName()); }
// public static yarnwrap.text.Text getCustomName() { return new yarnwrap.text.Text(net.minecraft.world.CommandBlockExecutor.getCustomName()); }

}