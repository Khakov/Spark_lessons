package classwork.practice_5

import org.apache.spark.mllib.feature.HashingTF

/**
  * @author Rustam Khakov
  */
object TrainUtils {

  def featurize(s: String) = {
    val numFeatures = 1000
    val tf = new HashingTF(numFeatures)
    tf.transform(s.sliding(2).toSeq)
  }
}
