package org.scalatra

import scala.language.reflectiveCalls

package object util {
  /**
   * Executes a block with a closeable resource, and closes it after the block runs
   *
   * @tparam A the return type of the block
   * @tparam B the closeable resource type
   * @param closeable the closeable resource
   * @param f the block
   */
  def using[A, B <: { def close(): Unit }](closeable: B)(f: B => A): Unit = {
    try {
      f(closeable)
    } finally {
      if (closeable != null)
        closeable.close()
    }
  }

}
