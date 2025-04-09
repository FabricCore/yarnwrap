package yarnwrap.block.dispenser;
public class FallibleItemDispenserBehavior { public net.minecraft.block.dispenser.FallibleItemDispenserBehavior wrapperContained; public FallibleItemDispenserBehavior(net.minecraft.block.dispenser.FallibleItemDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean success() { return wrapperContained.success; }
public boolean isSuccess() { return wrapperContained.isSuccess(); }
public void setSuccess(boolean success) { wrapperContained.setSuccess(success); }

}