package yarnwrap.client.gui.widget;
public class PlayerSkinWidget { public net.minecraft.client.gui.widget.PlayerSkinWidget wrapperContained; public PlayerSkinWidget(net.minecraft.client.gui.widget.PlayerSkinWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object models() { return wrapperContained.models; }
// // public void models(Object value) { wrapperContained.models = value; }
// // public static Object models() { return net.minecraft.client.gui.widget.PlayerSkinWidget.models; }
// // public static void models(Object value, ) { net.minecraft.client.gui.widget.PlayerSkinWidget.models = value; }

// public java.util.function.Supplier skinSupplier() { return wrapperContained.skinSupplier; }
// public void skinSupplier(java.util.function.Supplier value) { wrapperContained.skinSupplier = value; }
// public static java.util.function.Supplier skinSupplier() { return net.minecraft.client.gui.widget.PlayerSkinWidget.skinSupplier; }
// public static void skinSupplier(java.util.function.Supplier value, ) { net.minecraft.client.gui.widget.PlayerSkinWidget.skinSupplier = value; }

// public float xRotation() { return wrapperContained.xRotation; }
// public void xRotation(float value) { wrapperContained.xRotation = value; }
// public static float xRotation() { return net.minecraft.client.gui.widget.PlayerSkinWidget.xRotation; }
// public static void xRotation(float value, ) { net.minecraft.client.gui.widget.PlayerSkinWidget.xRotation = value; }

// public float yRotation() { return wrapperContained.yRotation; }
// public void yRotation(float value) { wrapperContained.yRotation = value; }
// public static float yRotation() { return net.minecraft.client.gui.widget.PlayerSkinWidget.yRotation; }
// public static void yRotation(float value, ) { net.minecraft.client.gui.widget.PlayerSkinWidget.yRotation = value; }

public PlayerSkinWidget(int width,int height,yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader,java.util.function.Supplier skinSupplier) { this.wrapperContained = new net.minecraft.client.gui.widget.PlayerSkinWidget(width,height,entityModelLoader.wrapperContained,skinSupplier); }

}