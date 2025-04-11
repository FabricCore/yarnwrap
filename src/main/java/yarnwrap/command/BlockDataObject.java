package yarnwrap.command;
public class BlockDataObject { public net.minecraft.command.BlockDataObject wrapperContained; public BlockDataObject(net.minecraft.command.BlockDataObject wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public yarnwrap.block.entity.BlockEntity blockEntity() { return new yarnwrap.block.entity.BlockEntity(wrapperContained.blockEntity); }
// public void blockEntity(yarnwrap.block.entity.BlockEntity value) { wrapperContained.blockEntity = value.wrapperContained; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_BLOCK_EXCEPTION() { return wrapperContained.INVALID_BLOCK_EXCEPTION; }
// public void INVALID_BLOCK_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_BLOCK_EXCEPTION = value; }
public java.util.function.Function TYPE_FACTORY() { return wrapperContained.TYPE_FACTORY; }
// public void TYPE_FACTORY(java.util.function.Function value) { wrapperContained.TYPE_FACTORY = value; }
public BlockDataObject(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.command.BlockDataObject(blockEntity.wrapperContained,pos.wrapperContained); }
// public Object method_13878(java.lang.String argumentName) { return wrapperContained.method_13878(argumentName); }

}