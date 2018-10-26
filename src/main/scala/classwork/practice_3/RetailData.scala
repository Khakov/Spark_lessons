package classwork.practice_3

import org.apache.spark.sql.types._

/**
  * @author Rustam Khakov
  */
object RetailData {
  val dataSchema = StructType(Array(
    StructField("InvoiceNo", StringType, true),
    StructField("StockCode", StringType, true),
    StructField("Description", StringType, true),
    StructField("Quantity", IntegerType, true),
    StructField("InvoiceDate", StringType, true),
    StructField("UnitPrice", DoubleType, true),
    StructField("CustomerID", IntegerType, true),
    StructField("Country", StringType, true)))
}



