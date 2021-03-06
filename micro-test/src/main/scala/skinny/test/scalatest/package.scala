package skinny.test

package object scalatest {

  @deprecated("Use SkinnyFeatureSpec instead.", "Skinny Framework 2.0.0, Skinny Micro 1.0.0")
  type ScalatraFeatureSpec = skinny.test.SkinnyFeatureSpec
  type SkinnyFeatureSpec = skinny.test.SkinnyFeatureSpec

  @deprecated("Use SkinnyFlatSpec instead.", "Skinny Framework 2.0.0, Skinny Micro 1.0.0")
  type ScalatraFlatSpec = SkinnyFlatSpec
  type SkinnyFlatSpec = skinny.test.SkinnyFlatSpec

  @deprecated("Use SkinnyFreeSpec instead.", "Skinny Framework 2.0.0, Skinny Micro 1.0.0")
  type ScalatraFreeSpec = SkinnyFreeSpec
  type SkinnyFreeSpec = skinny.test.SkinnyFreeSpec

  @deprecated("Use SkinnyFunSpec instead.", "Skinny Framework 2.0.0, Skinny Micro 1.0.0")
  type ScalatraFunSpec = SkinnyFunSpec
  type SkinnyFunSpec = skinny.test.SkinnyFunSpec

  @deprecated("Use SkinnyFunSuite instead.", "Skinny Framework 2.0.0, Skinny Micro 1.0.0")
  type ScalatraFunSuite = SkinnyFunSuite
  type SkinnyFunSuite = skinny.test.SkinnyFunSuite

  @deprecated("Use SkinnyJUnit3Suite instead.", "Skinny Framework 2.0.0, Skinny Micro 1.0.0")
  type ScalatraJUnit3Suite = SkinnyJUnit3Suite
  type SkinnyJUnit3Suite = skinny.test.SkinnyJUnit3Suite

  @deprecated("Use SkinnyJUnitSuite instead.", "Skinny Framework 2.0.0, Skinny Micro 1.0.0")
  type ScalatraJUnitSuite = SkinnyJUnitSuite
  type SkinnyJUnitSuite = skinny.test.SkinnyJUnitSuite

  @deprecated("Use SkinnySpec instead.", "Skinny Framework 2.0.0, Skinny Micro 1.0.0")
  type ScalatraSpec = SkinnySpec
  type SkinnySpec = skinny.test.SkinnySpec

  @deprecated("Use SkinnyWordSpec instead.", "Skinny Framework 2.0.0, Skinny Micro 1.0.0")
  type ScalatraWordSpec = SkinnyWordSpec
  type SkinnyWordSpec = skinny.test.SkinnyWordSpec

}
