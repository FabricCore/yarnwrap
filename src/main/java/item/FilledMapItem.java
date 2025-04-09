package yarnwrap.item;
public class FilledMapItem { public net.minecraft.item.FilledMapItem wrapperContained; public FilledMapItem(net.minecraft.item.FilledMapItem wrapperContained) { this.wrapperContained = wrapperContained; }

public void copyMap(yarnwrap.world.World world,yarnwrap.item.ItemStack stack) { wrapperContained.copyMap(world.wrapperContained,stack.wrapperContained); }
// public yarnwrap.component.type.MapIdComponent allocateMapId(yarnwrap.world.World world,int x,int z,int scale,boolean showIcons,boolean unlimitedTracking,yarnwrap.registry.RegistryKey dimension) { return new yarnwrap.component.type.MapIdComponent(wrapperContained.allocateMapId(world.wrapperContained,x,z,scale,showIcons,unlimitedTracking,dimension.wrapperContained)); }
// public boolean isAquaticBiome(boolean biomes,int x,int z) { return wrapperContained.isAquaticBiome(biomes,x,z); }
public yarnwrap.text.Text getIdText(yarnwrap.component.type.MapIdComponent id) { return new yarnwrap.text.Text(wrapperContained.getIdText(id.wrapperContained)); }
// public yarnwrap.block.BlockState getFluidStateIfVisible(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getFluidStateIfVisible(world.wrapperContained,state.wrapperContained,pos.wrapperContained)); }
// public void scale(yarnwrap.item.ItemStack map,yarnwrap.world.World world) { wrapperContained.scale(map.wrapperContained,world.wrapperContained); }
public yarnwrap.item.map.MapState getMapState(yarnwrap.component.type.MapIdComponent id,yarnwrap.world.World world) { return new yarnwrap.item.map.MapState(wrapperContained.getMapState(id.wrapperContained,world.wrapperContained)); }
public void updateColors(yarnwrap.world.World world,yarnwrap.entity.Entity entity,yarnwrap.item.map.MapState state) { wrapperContained.updateColors(world.wrapperContained,entity.wrapperContained,state.wrapperContained); }
public yarnwrap.item.map.MapState getMapState(yarnwrap.item.ItemStack map,yarnwrap.world.World world) { return new yarnwrap.item.map.MapState(wrapperContained.getMapState(map.wrapperContained,world.wrapperContained)); }
public void fillExplorationMap(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack map) { wrapperContained.fillExplorationMap(world.wrapperContained,map.wrapperContained); }
public yarnwrap.item.ItemStack createMap(yarnwrap.world.World world,int x,int z,byte scale,boolean showIcons,boolean unlimitedTracking) { return new yarnwrap.item.ItemStack(wrapperContained.createMap(world.wrapperContained,x,z,scale,showIcons,unlimitedTracking)); }

}