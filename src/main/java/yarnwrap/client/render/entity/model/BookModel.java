package yarnwrap.client.render.entity.model;
public class BookModel { public net.minecraft.client.render.entity.model.BookModel wrapperContained; public BookModel(net.minecraft.client.render.entity.model.BookModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public java.lang.String LEFT_PAGES() { return wrapperContained.LEFT_PAGES; }
// public void LEFT_PAGES(java.lang.String value) { wrapperContained.LEFT_PAGES = value; }
// public java.lang.String RIGHT_PAGES() { return wrapperContained.RIGHT_PAGES; }
// public void RIGHT_PAGES(java.lang.String value) { wrapperContained.RIGHT_PAGES = value; }
// public java.lang.String FLIP_PAGE1() { return wrapperContained.FLIP_PAGE1; }
// public void FLIP_PAGE1(java.lang.String value) { wrapperContained.FLIP_PAGE1 = value; }
// public java.lang.String FLIP_PAGE2() { return wrapperContained.FLIP_PAGE2; }
// public void FLIP_PAGE2(java.lang.String value) { wrapperContained.FLIP_PAGE2 = value; }
// public yarnwrap.client.model.ModelPart leftFlippingPage() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFlippingPage); }
// public void leftFlippingPage(yarnwrap.client.model.ModelPart value) { wrapperContained.leftFlippingPage = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightPages() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightPages); }
// public void rightPages(yarnwrap.client.model.ModelPart value) { wrapperContained.rightPages = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftCover() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftCover); }
// public void leftCover(yarnwrap.client.model.ModelPart value) { wrapperContained.leftCover = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftPages() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftPages); }
// public void leftPages(yarnwrap.client.model.ModelPart value) { wrapperContained.leftPages = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightCover() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightCover); }
// public void rightCover(yarnwrap.client.model.ModelPart value) { wrapperContained.rightCover = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightFlippingPage() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFlippingPage); }
// public void rightFlippingPage(yarnwrap.client.model.ModelPart value) { wrapperContained.rightFlippingPage = value.wrapperContained; }
public void setPageAngles(float pageTurnAmount,float leftFlipAmount,float rightFlipAmount,float pageTurnSpeed) { wrapperContained.setPageAngles(pageTurnAmount,leftFlipAmount,rightFlipAmount,pageTurnSpeed); }
// public void renderBook(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay) { wrapperContained.renderBook(matrices.wrapperContained,vertices.wrapperContained,light,overlay); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}