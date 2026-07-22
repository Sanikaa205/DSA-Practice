select * from Patients WHERE conditions like 'DIAB1%' OR conditions like '%DIAB1' OR conditions like '% DIAB1%'
      
#'ABC%' → ABC se start
#'%ABC' → ABC pe end
#'% ABC%' → Space ke baad ABC (naya word)
#'%ABC%' → ABC kahin bhi

