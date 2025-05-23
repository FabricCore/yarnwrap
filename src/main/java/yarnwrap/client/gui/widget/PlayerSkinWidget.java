package yarnwrap.client.gui.widget;
public class PlayerSkinWidget { public net.minecraft.client.gui.widget.PlayerSkinWidget wrapperContained; public PlayerSkinWidget(net.minecraft.client.gui.widget.PlayerSkinWidget wrapperContained) { this.wrapperContained = wrapperContained; }

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

// public yarnwrap.client.render.entity.model.PlayerEntityModel wideModel() { return new yarnwrap.client.render.entity.model.PlayerEntityModel(wrapperContained.wideModel); }
// public void wideModel(yarnwrap.client.render.entity.model.PlayerEntityModel value) { wrapperContained.wideModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.PlayerEntityModel wideModel() { return new yarnwrap.client.render.entity.model.PlayerEntityModel(net.minecraft.client.gui.widget.PlayerSkinWidget.wideModel); }
// public static void wideModel(yarnwrap.client.render.entity.model.PlayerEntityModel value, ) { net.minecraft.client.gui.widget.PlayerSkinWidget.wideModel = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.PlayerEntityModel slimModel() { return new yarnwrap.client.render.entity.model.PlayerEntityModel(wrapperContained.slimModel); }
// public void slimModel(yarnwrap.client.render.entity.model.PlayerEntityModel value) { wrapperContained.slimModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.PlayerEntityModel slimModel() { return new yarnwrap.client.render.entity.model.PlayerEntityModel(net.minecraft.client.gui.widget.PlayerSkinWidget.slimModel); }
// public static void slimModel(yarnwrap.client.render.entity.model.PlayerEntityModel value, ) { net.minecraft.client.gui.widget.PlayerSkinWidget.slimModel = value.wrapperContained; }

public PlayerSkinWidget(int width,int height,yarnwrap.client.render.entity.model.LoadedEntityModels entityModels,java.util.function.Supplier skinSupplier) { this.wrapperContained = new net.minecraft.client.gui.widget.PlayerSkinWidget(width,height,entityModels.wrapperContained,skinSupplier); }

}