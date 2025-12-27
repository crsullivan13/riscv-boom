//******************************************************************************
// Copyright (c) 2018 - 2018, The Regents of the University of California (Regents).
// All Rights Reserved. See LICENSE and LICENSE.SiFive for license details.
//------------------------------------------------------------------------------

package boom.v3.common

import chisel3._

import org.chipsalliance.cde.config.Parameters

/**
 * BOOM module that is used to add parameters to the module
 */
abstract class BoomModule(implicit p: Parameters) extends freechips.rocketchip.tile.CoreModule
  with HasBoomCoreParameters

/**
 * BOOM bundle used to add parameters to the object/class/trait/etc
 */
class BoomBundle(implicit val p: Parameters) extends freechips.rocketchip.util.ParameterizedBundle
  with HasBoomCoreParameters

// lets go with 6 bits for now. this is half of the size of each register field
class CBQRIBundle(implicit p: Parameters) extends BoomBundle()(p)
{
  val rcid = UInt(6.W)
  val mcid = UInt(6.W)
}
