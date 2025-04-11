package yarnwrap.client.render.block.entity;
public class LecternBlockEntityRenderer { public net.minecraft.client.render.block.entity.LecternBlockEntityRenderer wrapperContained; public LecternBlockEntityRenderer(net.minecraft.client.render.block.entity.LecternBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.BookModel book() { return new yarnwrap.client.render.entity.model.BookModel(wrapperContained.book); }
// public void book(yarnwrap.client.render.entity.model.BookModel value) { wrapperContained.book = value.wrapperContained; }
// public LecternBlockEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.block.entity.LecternBlockEntityRenderer(ctx); }

}