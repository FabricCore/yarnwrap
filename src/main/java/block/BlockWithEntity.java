package yarnwrap.block;
public class BlockWithEntity { public net.minecraft.block.BlockWithEntity wrapperContained; public BlockWithEntity(net.minecraft.block.BlockWithEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.BlockEntityTicker validateTicker(yarnwrap.block.entity.BlockEntityType givenType,yarnwrap.block.entity.BlockEntityType expectedType,yarnwrap.block.entity.BlockEntityTicker ticker) { return new yarnwrap.block.entity.BlockEntityTicker(wrapperContained.validateTicker(givenType.wrapperContained,expectedType.wrapperContained,ticker.wrapperContained)); }

}