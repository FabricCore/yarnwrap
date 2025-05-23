package yarnwrap.client.render.block.entity;
public class TestInstanceBlockEntityRenderer { public net.minecraft.client.render.block.entity.TestInstanceBlockEntityRenderer wrapperContained; public TestInstanceBlockEntityRenderer(net.minecraft.client.render.block.entity.TestInstanceBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.entity.BeaconBlockEntityRenderer beaconBlockEntityRenderer() { return new yarnwrap.client.render.block.entity.BeaconBlockEntityRenderer(wrapperContained.beaconBlockEntityRenderer); }
// public void beaconBlockEntityRenderer(yarnwrap.client.render.block.entity.BeaconBlockEntityRenderer value) { wrapperContained.beaconBlockEntityRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.block.entity.BeaconBlockEntityRenderer beaconBlockEntityRenderer() { return new yarnwrap.client.render.block.entity.BeaconBlockEntityRenderer(net.minecraft.client.render.block.entity.TestInstanceBlockEntityRenderer.beaconBlockEntityRenderer); }
// public static void beaconBlockEntityRenderer(yarnwrap.client.render.block.entity.BeaconBlockEntityRenderer value, ) { net.minecraft.client.render.block.entity.TestInstanceBlockEntityRenderer.beaconBlockEntityRenderer = value.wrapperContained; }

// public yarnwrap.client.render.block.entity.StructureBlockBlockEntityRenderer structureBlockBlockEntityRenderer() { return new yarnwrap.client.render.block.entity.StructureBlockBlockEntityRenderer(wrapperContained.structureBlockBlockEntityRenderer); }
// public void structureBlockBlockEntityRenderer(yarnwrap.client.render.block.entity.StructureBlockBlockEntityRenderer value) { wrapperContained.structureBlockBlockEntityRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.block.entity.StructureBlockBlockEntityRenderer structureBlockBlockEntityRenderer() { return new yarnwrap.client.render.block.entity.StructureBlockBlockEntityRenderer(net.minecraft.client.render.block.entity.TestInstanceBlockEntityRenderer.structureBlockBlockEntityRenderer); }
// public static void structureBlockBlockEntityRenderer(yarnwrap.client.render.block.entity.StructureBlockBlockEntityRenderer value, ) { net.minecraft.client.render.block.entity.TestInstanceBlockEntityRenderer.structureBlockBlockEntityRenderer = value.wrapperContained; }

// public TestInstanceBlockEntityRenderer(Object context) { this.wrapperContained = new net.minecraft.client.render.block.entity.TestInstanceBlockEntityRenderer(context); }

}