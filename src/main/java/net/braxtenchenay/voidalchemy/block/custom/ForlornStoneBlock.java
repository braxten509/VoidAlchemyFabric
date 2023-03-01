package net.braxtenchenay.voidalchemy.block.custom;

import net.braxtenchenay.voidalchemy.block.ModBlocks;
import net.braxtenchenay.voidalchemy.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ForlornStoneBlock extends Block {
    public ForlornStoneBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if (world.isClient() && hand == Hand.MAIN_HAND && player.getStackInHand(Hand.MAIN_HAND).getItem() == ModItems.BAG_OF_MIRCANTERS_DUST) {
            player.playSound(SoundEvents.ITEM_TOTEM_USE, 0.5f, 1f);
            player.playSound(SoundEvents.ENTITY_VEX_DEATH, 1f, 1f);
            player.sendMessage(Text.literal("A dark spirit seems to leave the stone as light replaces the").formatted(Formatting.YELLOW).formatted(Formatting.ITALIC));
            player.sendMessage(Text.literal("darkness...").formatted(Formatting.YELLOW).formatted(Formatting.ITALIC));
        }

        if (!world.isClient() && hand == Hand.MAIN_HAND && player.getStackInHand(Hand.MAIN_HAND).getItem() == ModItems.BAG_OF_MIRCANTERS_DUST) {
            world.setBlockState(pos, ModBlocks.ENLIGHTENED_STONE.getDefaultState());
        }

        if (world.isClient() && hand == Hand.MAIN_HAND && player.getStackInHand(Hand.MAIN_HAND).getItem() != ModItems.BAG_OF_MIRCANTERS_DUST) {
            //BLOCK_AMETHYST_BLOCK_CHIME
            player.playSound(SoundEvents.BLOCK_BONE_BLOCK_HIT, 1f, -1f);
            player.sendMessage(Text.literal("A hollow quietness resounds from within the block...").formatted(Formatting.GRAY));
        }

        return super.onUse(state, world, pos, player, hand, hit);
    }
}
