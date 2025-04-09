package yarnwrap.client.render.chunk;
public class SectionBuilder { public net.minecraft.client.render.chunk.SectionBuilder wrapperContained; public SectionBuilder(net.minecraft.client.render.chunk.SectionBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(wrapperContained.blockEntityRenderDispatcher); }
// public void addBlockEntity(Object data,yarnwrap.block.entity.BlockEntity blockEntity) { wrapperContained.addBlockEntity(data,blockEntity.wrapperContained); }
// public yarnwrap.client.render.BufferBuilder beginBufferBuilding(java.util.Map builders,yarnwrap.client.render.chunk.BlockBufferAllocatorStorage allocatorStorage,yarnwrap.client.render.RenderLayer layer) { return new yarnwrap.client.render.BufferBuilder(wrapperContained.beginBufferBuilding(builders,allocatorStorage.wrapperContained,layer.wrapperContained)); }
// public Object build(yarnwrap.util.math.ChunkSectionPos sectionPos,yarnwrap.client.render.chunk.ChunkRendererRegion renderRegion,net.minecraft.class_8251 vertexSorter,yarnwrap.client.render.chunk.BlockBufferAllocatorStorage allocatorStorage) { return wrapperContained.build(sectionPos.wrapperContained,renderRegion.wrapperContained,vertexSorter,allocatorStorage.wrapperContained); }

}