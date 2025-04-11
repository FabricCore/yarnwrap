package yarnwrap.client.gui.widget;
public class PlayerSkinWidget { public net.minecraft.client.gui.widget.PlayerSkinWidget wrapperContained; public PlayerSkinWidget(net.minecraft.client.gui.widget.PlayerSkinWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object models() { return wrapperContained.models; }
// // public void models(Object value) { wrapperContained.models = value; }
// public java.util.function.Supplier skinSupplier() { return wrapperContained.skinSupplier; }
// public void skinSupplier(java.util.function.Supplier value) { wrapperContained.skinSupplier = value; }
// public float xRotation() { return wrapperContained.xRotation; }
// public void xRotation(float value) { wrapperContained.xRotation = value; }
// public float yRotation() { return wrapperContained.yRotation; }
// public void yRotation(float value) { wrapperContained.yRotation = value; }
public PlayerSkinWidget(int width,int height,yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader,java.util.function.Supplier skinSupplier) { this.wrapperContained = new net.minecraft.client.gui.widget.PlayerSkinWidget(width,height,entityModelLoader.wrapperContained,skinSupplier); }

}