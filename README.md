{
  "data": {
    "id": "$data.data.id",
    "type": "$data.data.type",
    "attributes": {
      "securities": [
        #foreach($security in $data.data.attributes.securities)
        {
          "securityId": "$security.securityId",
          "securityType": "$security.securityType",
          "supportingSecurity Indicator": "$security.supportingSecurity Indicator",
          "supportedSecurityIndicator": "$security.supportedSecurityIndicator",
          "releaseSecurity": "$security.releaseSecurity",
          "existingSecurityIndicator": "$security.existingSecurityIndicator",
          "value": {
            "amount": "$security.value.amount",
            "currency": "$security.value.currency"
          },
          "priorChargeValue": {
            "amount": "$security.priorChargeValue.amount",
            "currency": "$security.priorChargeValue.currency"
          },
          "alsoSecuresValue": {
            "amount": "$security.alsoSecuresValue.amount",
            "currency": "$security.alsoSecuresValue.currency"
          },
          "address": {
            "addressLines": [
              #foreach($addressLine in $security.address.addressLines)
              "$addressLine"
              #if($foreach.hasNext),#end
              #end
            ],
            "postCode": "$security.address.postCode",
            "addressType": "$security.address.addressType",
            "country": "$security.address.country"
          }
        }
        #if($foreach.hasNext),#end
        #end
      ],
      "consultantDetails": [
        #foreach($consultantDetail in $data.data.attributes.consultantDetails)
        {
          "profession": "$consultantDetail.profession",
          "organisationName": "$consultantDetail.organisationName",
          "contactName": "$consultantDetail.contactName",
          "address": {
            "addressType": "$consultantDetail.address.addressType",
            "flat": "$consultantDetail.address.flat",
            "houseNumber": "$consultantDetail.address.houseNumber",
            "houseName": "$consultantDetail.address.houseName",
            "street": "$consultantDetail.address.street",
            "town": "$consultantDetail.address.town",
            "district": "$consultantDetail.address.district",
            "country": "$consultantDetail.address.country",
            "postCode": "$consultantDetail.address.postCode"
          },
          "telephone": {
            "telephoneType": "$consultantDetail.telephone.telephoneType",
            "telephoneNumber": "$consultantDetail.telephone.telephoneNumber"
          }
        }
        #if($foreach.hasNext),#end
        #end
      },
      "customerBusinessDetails": {
        "bicCode": "$data.data.attributes.customerBusinessDetails.bicCode",
        "btReference": "$data.data.attributes.customerBusinessDetails.btReference",
        "customerId": "$data.data.attributes.customerBusinessDetails.customerId",
        "referStream": "$data.data.attributes.customerBusinessDetails.referStream",
        "btaCode": "$data.data.attributes.customerBusinessDetails.btaCode",
        "businessType": "$data.data.attributes.customerBusinessDetails.businessType",
        "businessStartDate": "$data.data.attributes.customerBusinessDetails.businessStartDate",
        "companyRegister Number": "$data.data.attributes.customerBusinessDetails.companyRegister Number",
        "bankRelationshipStartDate": "$data.data.attributes.customerBusinessDetails.bankRelationshipStartDate",
        "businessName": "$data.data.attributes.customerBusinessDetails.businessName",
        "LegalStatus": "$data.data.attributes.customerBusinessDetails.LegalStatus",
        "emailAddress": [
          #foreach($email in $data.data.attributes.customerBusinessDetails.emailAddress)
          "$email"
          #if($foreach.hasNext),#end
          #end
        ],
        "registeredAddress": {
          "postCode": "$data.data.attributes.customerBusinessDetails.registeredAddress.postCode",
          "addressLines": [
            #foreach($addressLine in $data.data.attributes.customerBusinessDetails.registeredAddress.addressLines)
            "$addressLine"
            #if($foreach.hasNext),#end
            #end
          ],
          "addressType": "$data.data.attributes.customerBusinessDetails.registeredAddress.addressType",
          "addressEndDate": "$data.data.attributes.customerBusinessDetails.registeredAddress.addressEndDate",
          "country": "$data.data.attributes.customerBusinessDetails.registeredAddress.country",
          "addressStartDate": "$data.data.attributes.customerBusinessDetails.registeredAddress.addressStartDate"
        },
        "tradingAddress": {
          "postCode": "$data.data.attributes.customerBusinessDetails.tradingAddress.postCode",
          "addressLines": [
            #foreach($addressLine in $data.data.attributes.customerBusinessDetails.tradingAddress.addressLines)
            "$addressLine"
            #if($foreach.hasNext),#end
            #end
          ],
          "addressType": "$data.data.attributes.customerBusinessDetails.tradingAddress.addressType",
          "addressEndDate": "$data.data.attributes.customerBusinessDetails.tradingAddress.addressEndDate",
          "country": "$data.data.attributes.customerBusinessDetails.tradingAddress.country",
          "addressStartDate": "$data.data.attributes.customerBusinessDetails.tradingAddress.addressStartDate"
        },
        "correspondenceAddress": {
          "postCode": "$data.data.attributes.customerBusinessDetails.correspondenceAddress.postCode",
          "addressLines": [
            #foreach($addressLine in $data.data.attributes.customerBusinessDetails.correspondenceAddress.addressLines)
            "$addressLine"
            #if($foreach.hasNext),#end
            #end
          ],
          "addressType": "$data.data.attributes.customerBusinessDetails.correspondenceAddress.addressType",
          "addressEndDate": "$data.data.attributes.customerBusinessDetails.correspondenceAddress.addressEndDate",
          "country": "$data.data.attributes.customerBusinessDetails.correspondenceAddress.country",
          "addressStartDate": "$data.data.attributes.customerBusinessDetails.correspondenceAddress.addressStartDate"
        }
     
            },
      "bbmDetails": {
        "profileId": "$data.data.bbmDetails.profileId"
      },
      "directors": [
        #foreach($director in $data.data.directors)
        {
          "customerId": "$director.customerId",
          "title": "$director.title",
          "firstName": "$director.firstName",
          "middleName": "$director.middleName",
          "LastName": "$director.LastName",
          "mobileNumber": "$director.mobileNumber",
          "emailAddress": "$director.emailAddress",
          "dateOfBirth": "$director.dateOfBirth",
          "gender": "$director.gender",
          "consentForBureauSearch": "$director.consentForBureauSearch",
          "fraudAttestation": "$director.fraudAttestation",
          "addresses": [
            #foreach($address in $director.addresses)
            {
              "addressLines": [
                #foreach($addressLine in $address.addressLines)
                "$addressLine"
                #if($foreach.hasNext),#end
                #end
              ],
              "postCode": "$address.postCode",
              "addressType": "$address.addressType",
              "addressEndDate": "$address.addressEndDate",
              "country": "$address.country",
              "addressStartDate": "$address.addressStartDate",
              "residentialStatus": "$address.residentialStatus"
            }
            #if($foreach.hasNext),#end
            #end
          ],
          "telephone": [
            #foreach($telephone in $director.telephone)
            {
              "telephoneType": "$telephone.telephoneType",
              "telephoneNumber": "$telephone.telephoneNumber"
            }
            #if($foreach.hasNext),#end
            #end
          ]
        }
        #if($foreach.hasNext),#end
        #end
      ],
      "exposures": {
        "aggregatedExposures": {
          "primaryExposureProposed": "$data.data.attributes.exposures.aggregatedExposures.primaryExposureProposed",
          "tradingExposureProposed": "$data.data.attributes.exposures.aggregatedExposures.tradingExposureProposed",
          "settlementExposureProposed": "$data.data.attributes.exposures.aggregatedExposures.settlementExposureProposed",
          "primaryExposure Increase": "$data.data.attributes.exposures.aggregatedExposures.primaryExposure Increase",
          "tradingExposure Increase": "$data.data.attributes.exposures.aggregatedExposures.tradingExposure Increase",
          "settlementExposure Increase": "$data.data.attributes.exposures.aggregatedExposures.settlementExposure Increase",
          "primaryExposureExisting": "$data.data.attributes.exposures.aggregatedExposures.primaryExposureExisting",
          "tradingExposureExisting": "$data.data.attributes.exposures.aggregatedExposures.tradingExposureExisting",
          "settlementExposureExisting": "$data.data.attributes.exposures.aggregatedExposures.settlementExposureExisting",
          "overdraftExposureProposed": "$data.data.attributes.exposures.aggregatedExposures.overdraftExposureProposed",
          "securedLoanExposureProposed": "$data.data.attributes.exposures.aggregatedExposures.securedLoanExposureProposed",
          "unsecuredExposureProposed": "$data.data.attributes.exposures.aggregatedExposures.unsecuredExposureProposed",
          "overallExposureProposed": "$data.data.attributes.exposures.aggregatedExposures.overallExposureProposed",
          "totalExisting Exposure": "$data.data.attributes.exposures.aggregatedExposures.totalExisting Exposure",
          "assetFinanceExposureExisting": "$data.data.attributes.exposures.aggregatedExposures.assetFinanceExposureExisting",
          "odExistingExposure": "$data.data.attributes.exposures.aggregatedExposures.odExistingExposure",
          "salesFinanceExposureExisting": "$data.data.attributes.exposures.aggregatedExposures.salesFinanceExposureExisting",
          "LoansExposureExisting": "$data.data.attributes.exposures.aggregatedExposures.LoansExposureExisting",
          "unsecuredExisting Exposure": "$data.data.attributes.exposures.aggregatedExposures.unsecuredExisting Exposure",
          "unsecuredLoanExposureProposed": "$data.data.attributes.exposures.aggregatedExposures.unsecuredLoanExposureProposed"
        },
        "connectedExistingExposure": {
          "totalXrSettlementExposure": "$data.data.attributes.exposures.connectedExistingExposure.totalXrSettlementExposure",
          "totalXrSalesFinanceExposure": "$data.data.attributes.exposures.connectedExistingExposure.totalXrSalesFinanceExposure",
          "totalOverdraftExposure": "$data.data.attributes.exposures.connectedExistingExposure.totalOverdraftExposure",
         
        "totalXrAssetFinanceExposure": "$data.data.attributes.exposures.connectedExistingExposure.totalXrAssetFinanceExposure",
        "totalXrotherExposure": "$data.data.attributes.exposures.connectedExistingExposure.totalXrotherExposure",
        "totalMortgageExposure": "$data.data.attributes.exposures.connectedExistingExposure.totalMortgageExposure",
        "totalLoanExposure": "$data.data.attributes.exposures.connectedExistingExposure.totalLoanExposure",
        "totalSettlementExposure": "$data.data.attributes.exposures.connectedExistingExposure.totalSettlementExposure"
      }
    },
    "customerFinancialDetails": {
      "LoansInterest": "$data.data.customerFinancialDetails.LoansInterest",
      "LatestNetProfit": "$data.data.customerFinancialDetails.LatestNetProfit",
      "servicingSurplus": "$data.data.customerFinancialDetails.servicingSurplus",
      "short TermLoansAndHp": "$data.data.customerFinancialDetails.shortTermLoansAndHp",
      "LatestFfDate": "$data.data.customerFinancialDetails.LatestFfDate"
    },
    "questionnaire": [
      #foreach($question in $data.data.questionnaire)
      {
        "key": "$question.key",
        "value": "$question.value"
      }
      #if($foreach.hasNext),#end
      #end
    ],
    "borrowingDetails": {
      "facilities": [
        #foreach($facility in $data.data.borrowingDetails.facilities)
        {
          "facilityDetailId": "$facility.facilityDetailId",
          "facilityIndicator": "$facility.facilityIndicator",
          "pricingProductGroup": "$facility.pricingProductGroup",
          "productLine": "$facility.productLine",
          "productType": "$facility.productType",
          "securedFlag": "$facility.securedFlag",
          "productCode": "$facility.productCode",
          "term": "$facility.term",
          "expiryDate": "$facility.expiryDate",
          "sortCode": "$facility.sortCode",
          "accountNumber": "$facility.accountNumber",
          "amount": {
            "amount": "$facility.amount.amount",
            "currency": "$facility.amount.currency"
          },
          "overlayType": "$facility.overlayType",
          "rateType": "$facility.rateType",
          "pricingInfo": {
            "fees": "$facility.pricingInfo.fees",
            "interestRate": "$facility.pricingInfo.interestRate"
          },
          "purpose": "$facility.purpose",
          "mcobIdentifier": "$facility.mcobIdentifier"
        }
        #if($foreach.hasNext),#end
        #end
      ]
    },
    "applicationDetails": {
      "channel": "$data.data.applicationDetails.channel",
      "decisionSystemId": "$data.data.applicationDetails.decisionSystemId",
      "applicationType": "$data.data.applicationDetails.applicationType",
      "decisionParams": {
        "creditDecision": "$data.data.applicationDetails.decisionParams.creditDecision",
        "fraud Decision": "$data.data.applicationDetails.decisionParams.fraud Decision"
      },
      "appRepCount": "$data.data.applicationDetails.appRepCount",
      "entity": "$data.data.applicationDetails.entity",
      "noOfFacilities": "$data.data.applicationDetails.noOfFacilities",
      "no0fDirectors": "$data.data.applicationDetails.no0fDirectors",
      "noOfSecurities": "$data.data.applicationDetails.noOfSecurities",
      "applicationDate": "$data.data.applicationDetails.applicationDate",
      "fraudSystemId": "$data.data.applicationDetails.fraudSystemId",
      "consumerBureauId": "$data.data.applicationDetails.consumerBureauId",
      "bpalMaxLimit": {
        "amount": "$data.data.applicationDetails.bpalMaxLimit.amount",
        "currency": "$data.data.applicationDetails.bpalMaxLimit.currency"
      }
    }
  }
}
