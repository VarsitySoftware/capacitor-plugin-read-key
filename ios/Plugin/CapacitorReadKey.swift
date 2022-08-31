import Foundation

@objc public class CapacitorReadKey: NSObject {
     @objc public func read(_ value: String) -> String {
        print(value)
        return value
    }
}
