package yarnwrap.command;
public class BlockDataObject { public net.minecraft.command.BlockDataObject wrapperContained; public BlockDataObject(net.minecraft.command.BlockDataObject wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public yarnwrap.block.entity.BlockEntity blockEntity() { return new yarnwrap.block.entity.BlockEntity(wrapperContained.blockEntity); }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_BLOCK_EXCEPTION() { return wrapperContained.INVALID_BLOCK_EXCEPTION; }
public java.util.function.Function TYPE_FACTORY() { return wrapperContained.TYPE_FACTORY; }

}