package yarnwrap.client.render.block.entity;
public class EnchantingTableBlockEntityRenderer { public net.minecraft.client.render.block.entity.EnchantingTableBlockEntityRenderer wrapperContained; public EnchantingTableBlockEntityRenderer(net.minecraft.client.render.block.entity.EnchantingTableBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.util.SpriteIdentifier BOOK_TEXTURE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.BOOK_TEXTURE); }
// public void BOOK_TEXTURE(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.BOOK_TEXTURE = value.wrapperContained; }
// public yarnwrap.client.render.entity.model.BookModel book() { return new yarnwrap.client.render.entity.model.BookModel(wrapperContained.book); }
// public void book(yarnwrap.client.render.entity.model.BookModel value) { wrapperContained.book = value.wrapperContained; }
// public EnchantingTableBlockEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.block.entity.EnchantingTableBlockEntityRenderer(ctx); }

}