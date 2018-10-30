datatype day = Sunday       |
               Monday       |
               Tuesday      |
               Wednesday    |
               Thursday     |
               Friday       |
               Saturday;

fun isWeekday(d) = 
    d <> Saturday andalso d <> Sunday;