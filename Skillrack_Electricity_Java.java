package com.appxstudioinc;
public class Skillrack_Electricity_Java {



    class ElectricityBill{
        int CustomerNumber,CustomerPreviousReading,CustomerCurrentReading;
        String CustomerName;
        boolean Cond;
        public void setConsumerNumber(int n)
        {
            CustomerNumber=n;
        }
        public void setConsumerName(String name)
        {
            CustomerName = name;
        }
        public void setPreviousMonthReading(int p)
        {
            CustomerPreviousReading = p;
        }
        public void setCurrentMonthReading(int c)
        {
            CustomerCurrentReading = c;
        }
        public void setIsDomestic(boolean condition)
        {
            Cond = condition;
        }
        public double calculateBillAmount()
        {
            if (Cond)
            {
                int unit = CustomerCurrentReading - CustomerPreviousReading
                        ;
                double amt;
                if(unit<=100)
                {
                    amt = unit*1;
                }
                else if (unit>=101 && unit <=200)
                {
                    amt = (100)+((unit-100)*2.50);
                }
                else if(unit-100>=201 && unit <500)
                {
                    amt = (350+(unit-200)*4);
                }
                else
                {
                    amt = (1550) +((unit-500)*6);
                }
                return amt;
            }
            else
            {
                int unit = CustomerCurrentReading - CustomerPreviousReading
                        ;
                double amt;
                if (unit<=100)
                {
                    amt = unit*2;
                }
                else if(unit>=101 && unit<=200)
                {
                    amt = (200)+((unit-100)*4.5);
                }
                else if(unit>=201 && unit<=500)
                {
                    amt = (650)+((unit-200)*6);
                }
                else
                {
                    amt= (2450+(unit-500)*7);
                }
                return amt;
            }
        }
    }
}
