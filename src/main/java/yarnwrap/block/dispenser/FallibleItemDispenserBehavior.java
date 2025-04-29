package yarnwrap.block.dispenser;
public class FallibleItemDispenserBehavior { public net.minecraft.block.dispenser.FallibleItemDispenserBehavior wrapperContained; public FallibleItemDispenserBehavior(net.minecraft.block.dispenser.FallibleItemDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean success() { return wrapperContained.success; }
// public void success(boolean value) { wrapperContained.success = value; }
// public static boolean success() { return net.minecraft.block.dispenser.FallibleItemDispenserBehavior.success; }
// public static void success(boolean value, ) { net.minecraft.block.dispenser.FallibleItemDispenserBehavior.success = value; }

public boolean isSuccess() { return wrapperContained.isSuccess(); }
// public static boolean isSuccess() { return net.minecraft.block.dispenser.FallibleItemDispenserBehavior.isSuccess(); }
public void setSuccess(boolean success) { wrapperContained.setSuccess(success); }
// public static void setSuccess(boolean success, ) { net.minecraft.block.dispenser.FallibleItemDispenserBehavior.setSuccess(success); }

}